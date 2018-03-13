package com.google.school.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.google.school.model.Student;

@Service
public class StudentService {

	private static ArrayList<Student> studentArray;

	public StudentService() {
		super();
		studentArray = new ArrayList<Student>();
	}

	public static ArrayList<Student> getStudentArray() {
		return studentArray;
	}

	public static void setStudentArray(ArrayList<Student> studentArray) {
		StudentService.studentArray = studentArray;
	}
	
	public int addStudent(Student s) {
		studentArray.add(s);		
		return s.getRollNo();
	}
	
	public String deleteStudent(int rollNo) {
		String response = null;
		for(int i=0; i< studentArray.size(); i++) {
			if(studentArray.get(i).getRollNo() == rollNo) {
				studentArray.remove(i);
				response = "Successfully deleted the record.";
				return response;
			}
		}
		response ="Student Roll No not present in records";
		return response;
	}
	
	public Student getStudent(int rollNo) {
		Student s = new Student();
		for(int i=0; i< studentArray.size(); i++) {
			if(studentArray.get(i).getRollNo() == rollNo) {
				return studentArray.get(i);
			}
		}
		return s;
	}
	
	public Student listStudentInSection(String className) {
		Student s = new Student();
		for(int i=0;i<studentArray.size();i++) {
			if(studentArray.get(i).getClassName() == className) {
				return studentArray.get(i);
			}
		}
		return s;
	}
	
}
