package com.cestar.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.cestar.dao.UserDao;
import com.cestar.model.User;

/**
 * Servlet implementation class AuthController
 */
@WebServlet("/")
public class AuthController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserDao dao = new UserDao();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = request.getServletPath();
		
		switch(url) {
		case "/login-form": {
			loginForm(request, response);
			break;
		}
		case "/signup-form": {
			signupForm(request, response);
			break;
		}
		case "/signup": {
			signup(request, response);
			break;
		}
		case "/login": {
			login(request, response);
			break;
		}
		case "/logout": {
			logout(request, response);
			break;
		}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	protected void signupForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("signup.jsp");
		rd.forward(request, response);
	}
	
	protected void signup(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		String city = request.getParameter("city");
		
		User user = new User(username, password, contact, city, email);
		int status = dao.insertUser(user);
		
		if(status > 0)
			request.setAttribute("success", "You have registered successfully.");
		signupForm(request,response);
		
		request.setAttribute("error", "User registration failed. Please try again.");
		signupForm(request,response);
	}
	
	protected void loginForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	}
	
	protected void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
	    String password = request.getParameter("password");

	    User user = dao.validateUser(username, password);
	    
	    if (user != null) {
	        // Store user in session
	        request.getSession().setAttribute("user", user);
	        response.sendRedirect("success.jsp"); // Redirect to success page
	    } else {
	        request.setAttribute("error", "Invalid username or password.");
	        loginForm(request,response);
	    }
	}
	
	protected void logout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			request.getSession().invalidate();
			response.sendRedirect("login-form");
		}

}
