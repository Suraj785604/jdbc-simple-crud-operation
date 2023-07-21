package com.jsp.student_crud_with_prepared.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class studentConnection {
	
	public static Connection getStudentConnection() {
		try {
			//step-1 load/register
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step-2 Create Connection
			String url ="jdbc:mysql://localhost:3306/jdbc-preparedstatement";
			String user = "root";
			String pass = "root";
			
			Connection connection=DriverManager.getConnection(url, user,pass);
			
			return connection;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
		
		
		
	}
}
