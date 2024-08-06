package com.aj.assignment2.serviceImpl;

import org.springframework.stereotype.Service;

import com.aj.assignment2.model.Student;
import com.aj.assignment2.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Override
	public String ajayMsg() {
		String str = "HeLLo, WElCome You Are In My PAge!!!";
		
		return str;
	}

	@Override
	public Student studentData() {
		Student student = new Student(1, "Ajay Ramayane", "Indore", "ajayramayane2000@gmail.com");
		return student;
	}

	@Override
	public String studentId() {
		String str = "Student Id is : "+studentData().getId();
		return str;
	}

	@Override
	public String studentName() {
		String str = "Student NAme is : "+studentData().getName();
		return str;
	}

	@Override
	public String studentAddress() {
		String str = "Student Address is : "+studentData().getAddress();
		return str;
	}

	@Override
	public String studentEmail() {
		String str = "Student Email id is : "+studentData().getEmail();
		return str;
	}

}
