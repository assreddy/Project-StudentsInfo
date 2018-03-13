package com.google.school.controllers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.school.model.Fee;
import com.google.school.model.Parent;
import com.google.school.model.Student;
import com.google.school.service.StudentService;

@RestController
@RequestMapping("/school")
public class SchoolController {
	@Autowired
	StudentRepository studentRepository;

	@Autowired
	StudentService studentService;

	@Autowired  
	JdbcTemplate jdbc;

	@RequestMapping(method=RequestMethod.GET, value="/healthcheck")
	public String index() {
		return "Welcome Spring Boot Reddy Public School Student Information System.....";
	}

	@GetMapping(path="/InputFromUrl/addStudent")
	//http://localhost:55555/school/InputFromUrl/addStudent?rollNo=300&studentName='S30'&className='KG10'
	public @ResponseBody String addStudent(@RequestParam int rollNo, @RequestParam String studentName, @RequestParam String className){
		Student s = new Student();
		s.setRollNo(rollNo);
		s.setStudentName(studentName);
		s.setClassName(className);
		studentRepository.save(s);
		return "Saved.";
	}

	@GetMapping(path="/InputFromUrl/deleteStudent")
	@ResponseBody
	//http://localhost:55555/school//InputFromUrl/deleteStudent?rollNo=200
	public String deleteStudent(int rollNo){
		Student s = new Student(rollNo);
		studentRepository.delete(s);
		return "Delleted Record From Student Table!";
	}

	// Using jdbc SQL Statements
	//http://localhost:55555/school/UsingSQLQuery/add?roll_no=10000&student_name=S10000&class_name=KG10000

	@RequestMapping("/UsingSQLQuery/add")
	@ResponseBody
	public String addNewUserUsingJDBC(int roll_no, String student_name, String class_name) {
		String SQL = "insert into students (roll_no, student_name, class_name) values (?, ?, ?)";
		jdbc.update(SQL,roll_no, student_name,class_name);
		return "UsingSQLQuery - Row Added To the table!.";
	}

	@RequestMapping(method=RequestMethod.DELETE,
			value = "/UsingSQLQuery/delete/{roll_no}",
			produces = "application/json")

	//http://localhost:55555/school/UsingSQLQuery/delete?roll_no=10000 --> Working with this only.
	public @ResponseBody String addDeleteUserUsingJDBC(@PathVariable int roll_no) {
		String SQL = "delete from students where roll_no = ?";
		try {
			jdbc.update(SQL, roll_no);
			return "UsingSQLQuery - Row Delete from the table!."+roll_no;
		} catch (RuntimeException re) {
			return "Unable to Delete."+roll_no;
		}
	}

	@RequestMapping("/UsingSQLQuery/modify")
	@ResponseBody
	//http://localhost:55555/school/UsingSQLQuery/modify?roll_no=10000&student_name=S10001&class_name=KG10001
	public String addModifyUserUsingJDBC(int roll_no, String student_name, String class_name) {
		String SQL = "update students set student_name = ?, class_name = ? where roll_no = ?";
		try {
			jdbc.update(SQL, student_name, class_name, roll_no);
			return "UsingSQLQuery - Updated Student info !."+roll_no;
		} catch (RuntimeException re) {
			return "Unable to Updated Studnet info = "+roll_no;

		}
	}

	@RequestMapping(method=RequestMethod.GET,
			value = "/UsingSQLQuery/selectone/{roll_no}",
			produces = "application/json")
	@ResponseBody
	//http://localhost:55555/school/UsingSQLQuery/selectone/100
	public Student addSelectOneUserUsingJDBC(@PathVariable int roll_no) {
		String SQL = "select * from students where roll_no = ?";
		Student s = jdbc.queryForObject(SQL,new Object[]{roll_no}, new RowMapper<Student>() {

			public Student mapRow(ResultSet rs, int roll_no) throws SQLException {
				Student s = new Student();
				s.setRollNo(rs.getInt("roll_no"));
				s.setStudentName(rs.getString("student_name"));
				s.setClassName(rs.getString("class_name"));
				return s;
			}
		});
		return s;
	}

	@RequestMapping(method=RequestMethod.GET,
			value = "/UsingSQLQuery/all",
			produces="application/json")
	@ResponseBody
	//http://localhost:55555/school/UsingSQLQuery/all
	public List<Student> getAllStudentsUserUsingJDBC() {
		String SQL = "select * from students";
		List<Student> studentList = jdbc.query(SQL, new RowMapper<Student>(){
			public Student mapRow(ResultSet rs, int roll_no) throws SQLException {
				Student s = new Student();
				s.setRollNo(rs.getInt("roll_no"));
				s.setStudentName(rs.getString("student_name"));
				s.setClassName(rs.getString("class_name"));
				return s;
			}
		});
		return studentList;
	}
}

/*
	@Autowired
	StudentService studentService;

	@RequestMapping(method=RequestMethod.GET, value="/healthcheck")
    public String index() {
        return "Welcome Spring Boot Reddy Public School Student Information System.....";
    }

	@RequestMapping(method=RequestMethod.PUT, 
			value="/student",
			produces="application/json",
			consumes="application/json")
	public @ResponseBody int addStudent(@RequestBody Student s) {
		int rollNo;
		rollNo = studentService.addStudent(s);
		return rollNo;
	}

	@RequestMapping(method=RequestMethod.DELETE, 
			value="/student/{rollNo}",
			produces="application/json")
	public @ResponseBody String deleteStudent(@PathVariable int rollNo) {
		String response = studentService.deleteStudent(rollNo);
		return response;
	}

	@RequestMapping(method=RequestMethod.GET, 
			value="/student",
			produces="application/json")
	public @ResponseBody ArrayList<Student> getAllStudents() {
		return studentService.getStudentArray();
	}

	@RequestMapping(method=RequestMethod.GET, 
			value="/student/{rollNo}",
			produces="application/json")
	public @ResponseBody Student getStudent(@PathVariable int rollNo) {
		return studentService.getStudent(rollNo);
	}
}
 */