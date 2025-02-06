package com.cestar.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return con;

	}

}
