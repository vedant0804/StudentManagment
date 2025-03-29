package com.Student_management.student_management_system.Models;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.ValueGenerationType;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Course {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cid;
    
	private String name;
	
	@CreationTimestamp
	private Date createdat;
	
	@ManyToMany(mappedBy="courses")
	private List<Student> std = new ArrayList<>();
}
