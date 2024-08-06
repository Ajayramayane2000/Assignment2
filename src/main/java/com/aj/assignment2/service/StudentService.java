package com.aj.assignment2.service;

import org.springframework.stereotype.Service;

import com.aj.assignment2.model.Student;

@Service
public interface StudentService {

	String ajayMsg();

	Student studentData();

	String studentId();

	String studentName();

	String studentAddress();

	String studentEmail();

}
