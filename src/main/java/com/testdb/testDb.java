package com.testdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class testDb
 */
@WebServlet("/testDb")
public class testDb extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = "springstudent";
		String password = "springstudent";
		String jdbcUrl = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false&serverTimezone=UTC";
		String Driver = "com.mysql.jdbc.Driver";
		
		try
		{
			PrintWriter out = response.getWriter();
			
			out.println("Connecting to: " + jdbcUrl);
			
			Class.forName(Driver);
			
			Connection connection = DriverManager.getConnection(jdbcUrl, user, password);
			
			out.println("Successfull");
			
			connection.close();
			
;		}catch(Exception x)
		{
			x.printStackTrace()	;	
		}
	}

}
