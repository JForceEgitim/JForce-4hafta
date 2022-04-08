package com.jforce.tr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jforce.tr.modal.Exam;
import com.jforce.tr.service.ExamServiceImpl;

@RestController
public class ExamController {
		
	@Autowired
	ExamServiceImpl ExamService;
	
	@RequestMapping(path = "examlist", method = RequestMethod.GET)
	public List<Exam> getListStudents(){
	return ExamService.getList();
		}
}