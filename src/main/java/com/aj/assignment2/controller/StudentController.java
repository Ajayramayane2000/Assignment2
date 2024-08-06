package com.aj.assignment2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aj.assignment2.model.Student;
import com.aj.assignment2.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService; 
	
	
	@GetMapping("/msgByAj")
	public String msgByAjay() {
		return studentService.ajayMsg();
	}
	
	@GetMapping("/data")
	public Student getStudentData() {
		return studentService.studentData();
	}
	
	@GetMapping("/studentId")
	public String getStudentId() {
		return studentService.studentId();
	}
	
	@GetMapping("/studentName")
	public String getStudentName() {
		return studentService.studentName();
	}
	
	@GetMapping("/studentAddress")
	public String getStudentAddress() {
		return studentService.studentAddress();
	}
	
	@GetMapping("/studentEmail")
	public String getStudentEmail() {
		return studentService.studentEmail();
	}
}
