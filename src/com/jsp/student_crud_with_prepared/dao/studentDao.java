package com.jsp.student_crud_with_prepared.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jsp.student_crud_with_prepared.connection.studentConnection;
import com.jsp.student_crud_with_prepared.dto.student;

public class studentDao {
	
	Connection connection=studentConnection.getStudentConnection();
	
	/*
	 * insert method for student
	 */
	public student insertStudent(student student) {
		
		String insertQuery="insert into student values(?,?,?,?)";
		
		try {
			
			PreparedStatement preparedStatement=connection.prepareStatement(insertQuery);
			
			preparedStatement.setInt(1, student.getStudentId());
			preparedStatement.setString(2, student.getStudentName());
			preparedStatement.setString(3, student.getStudentEmail());
			preparedStatement.setLong(4, student.getStudentPhone());
			preparedStatement.execute();
			
			System.out.println("Data Stored");
			 
//			return student;
		} catch (SQLException e) {
			// TODO: handle exception
		}
		return student;
		
		
	}
	
	public void displayStudentDetails() {
		String displayStudentQuery="SELECT * FROM student";
		
		try {
			PreparedStatement prepareStatemen=connection.prepareStatement(displayStudentQuery);
			
			ResultSet resultSet=prepareStatemen.executeQuery();
			
			resultSet.next();
			
			int id=resultSet.getInt("id");
			String name=resultSet.getString("name");
			String email=resultSet.getString("email");
			long phone=resultSet.getLong("email");
			
			System.out.println("============================================");
			
			System.out.println("Id"+id);
			System.out.println("Name"+name);
			System.out.println("Email"+email);
			System.out.println("Phone"+phone);
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	/*
	 * delete method
	 */

}
