package com.jsp.student_crud_with_prepared.controller;

import java.util.Scanner;

import com.jsp.student_crud_with_prepared.dao.studentDao;
import com.jsp.student_crud_with_prepared.dto.student;
import com.jsp.student_crud_with_prepared.service.studentService;

public class studentController {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("main method started!!!!");
		
		student student = null;
		
		studentService studentService = new studentService();
		
		studentService.insertStudentService(student);
		System.out.println("main method ended!!!!");
		System.out.println("1.Insert\n2.Update");
		System.out.println("enter your option");
		int ch = scanner.nextInt();
		switch (ch) {
		 
		case 1: {
			System.out.println("Enter student Id");
			int id = scanner.nextInt();
			System.out.println("Enter student name");
			String name = scanner.next();
			System.out.println("Enter your email");
			String email = scanner.next();
			System.out.println("Enter your phone");
			long phone = scanner.nextLong();
			
			student = new student(id, name, email, phone);
			studentService.insertStudentService(student);
		}
		   break;
		   
		case 2: {
		}
		   break;
		  
		}
		
//		student student = new student(21, "Suraj Kumar", "suraj02@gmail.com", 7739);
//		
//		studentdao studentDao = new studentdao();
//		
//		studentDao.insertStudent(student);
//		
	}
}