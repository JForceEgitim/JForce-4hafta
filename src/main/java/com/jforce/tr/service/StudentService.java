package com.jforce.tr.service;

import java.util.List;

import com.jforce.tr.modal.Student;

public interface StudentService {
	
	List<Student> getList();
	Student getStudentByIdStudent (Integer id);
	void deleteStudentByIdStudent (Integer id);
	void addStudentByIdStudent (Student student);
	void updateStudentByIdStudent (Student student);
	void updateStudentById (Integer id, String Name);
}
