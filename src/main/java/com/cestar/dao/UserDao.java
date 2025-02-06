package com.cestar.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cestar.model.User;

public class UserDao {
	
	public Connection dbConnection() {

		// Create a variable of return type
		Connection con = null;

		String url = "jdbc:mysql://localhost:3306/cestardb";
		String user = "root";
		String pwd = "";

		// Load the sql driver

		try {
			Class.forName("com.mysql.jdbc.Driver");

			// Call the getConnection method from DriverManager Class

			// Save it in con variable

			con = DriverManager.getConnection(url, user, pwd);

			System.out.println("Connection Successfull !!");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return con;
	}
	
	public int insertUser(User user) {
		int status = 0;
		
		String sql = "INSERT INTO users (username, password, contact, city, email) VALUES (?, ?, ?, ?, ?)";
		Connection con = dbConnection();
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
		
			pstmt.setString(1, user.getUserName());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getContact());
			pstmt.setString(4, user.getCity());
			pstmt.setString(5, user.getEmail());
			status = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.err.println("Error adding user: " + e.getMessage());
		}
		return status;
	}

}
