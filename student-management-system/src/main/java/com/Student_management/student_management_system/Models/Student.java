package com.Student_management.student_management_system.Models;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id ;
	
	private String name;
	
	private String email;
	
	private LocalDate dob;
	
	@CreationTimestamp
	private Date createdat;
	@UpdateTimestamp
	private Date updatedat;
	
	@ManyToMany
	private List<Course> courses = new ArrayList<>();
}
