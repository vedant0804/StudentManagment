package com.Student_management.student_management_system.Dto;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.Student_management.student_management_system.Models.Course;


public class StudentDto {

	private int id ;
	
	private String name;
	
	private String email;
	
	private LocalDate dob;
	
	
	private Date createdat;

	private Date updatedat;
	

	private List<Course> courses = new ArrayList<>();

}
