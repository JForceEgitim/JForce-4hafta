package com.jforce.tr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jforce.tr.modal.Student;
import com.jforce.tr.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;

	@RequestMapping(path = "studentlist", method = RequestMethod.GET)
	public List<Student> getListStudents() {
		return studentService.getList();
	}

	@RequestMapping(path = "studentbyıd/{id}", method = RequestMethod.GET)
	public Student getStudent(@PathVariable("id") Integer id) {
		return studentService.getStudentByIdStudent(id);
	}

	@RequestMapping(path = "studentbyıd/{id}", method = RequestMethod.DELETE)
	public String deleteStudent(@PathVariable("id") Integer id) {
		studentService.deleteStudentByIdStudent(id);
		System.out.println("öğrenci silinmiştir");
		return "öğrenci silinmiştir";
	}

	@RequestMapping(path = "studentbyıd", method = RequestMethod.PUT)
	public String deleteStudent(@RequestBody Student student) {
		studentService.addStudentByIdStudent(student);
		System.out.println("öğrenci eklenmiştir");
		return "öğrenci eklenmiştir";
	}
	
	@RequestMapping(path = "studentby", method = RequestMethod.PUT)
	public String updateStudent(@RequestBody Student student) {
		studentService.updateStudentByIdStudent(student);
		System.out.println("öğrenci güncellenmiştir");
		return "öğrenci güncellenmiştir";
	}
	
	@RequestMapping(path = "studentbyıd/{id}/{name}", method = RequestMethod.GET)
	public String ıdfornameStudent(@PathVariable("id") Integer id , @PathVariable("name") String Name) {
		studentService.updateStudentById(id,Name);
		System.out.println("öğrenci güncellenmiştir");
	return "öğrenci güncellenmiştir";
	}
}
