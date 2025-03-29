package com.Student_management.student_management_system.contollers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Home")
public class Homecontoller {
@GetMapping("/")
public String Hello()
{
	return "Hello java";
}
}
