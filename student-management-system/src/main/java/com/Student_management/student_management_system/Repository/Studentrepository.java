package com.Student_management.student_management_system.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Student_management.student_management_system.Models.Student;


@Repository
public interface Studentrepository extends JpaRepository<Student,Integer>{

}
