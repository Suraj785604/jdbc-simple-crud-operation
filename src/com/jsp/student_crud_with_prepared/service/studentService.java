package com.jsp.student_crud_with_prepared.service;

import com.jsp.student_crud_with_prepared.dao.studentDao;
import com.jsp.student_crud_with_prepared.dto.student;

public class studentService {
	studentDao studentDao = new studentDao();
	/**
	 * INSERT METHOD FOR STUDENT
	 */
	
	public student insertStudentService(student student)
	{
		System.out.println("InsertService method stared");
		
		try {
			if(student.getStudentId()<=9999)
			{
				student student2 = studentDao.insertStudent(student);
				System.out.println("InsertService method ended");
				return student2;
			}
			else {
				System.err.println("Please pass your id with 4 digit or less than it");
			}
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
		return null;
		
		
	}/*INSERT METHOD ENDS*/
	public int updatestudentname(int studentid, String studentname) {
		
		return studentDao.updatestudentname(studentid, studentname);
	}

}