package com.Student_management.student_management_system.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.Student_management.student_management_system.Models.Student;
import com.Student_management.student_management_system.Service.StudentService;

@RestController
@RequestMapping("/Student")
public class StudentController {
	
	@Autowired
	private StudentService ss;
	
	@PostMapping("/Add")
	public ResponseEntity<Student> addStudent(@RequestBody Student st1)
	{
	  Student s1= ss.addStudent(st1);
	  if(s1!=null)
	  {
		  return ResponseEntity.status(HttpStatus.CREATED).body(s1);
	  }
	  return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(s1);
	}

}
