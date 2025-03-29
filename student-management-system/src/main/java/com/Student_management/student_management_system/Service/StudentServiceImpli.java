package com.Student_management.student_management_system.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Student_management.student_management_system.Models.Student;
import com.Student_management.student_management_system.Repository.Studentrepository;

@Service
public class StudentServiceImpli implements StudentService{
 
	@Autowired
	private Studentrepository stu;
	
	@Override
	public Student addStudent(Student st)
	{
		
		if(st!=null)
		{
			stu.save(st);
			return st;
		}
		return null;
	}

	
	
}
