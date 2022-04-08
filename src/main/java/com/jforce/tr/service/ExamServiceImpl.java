package com.jforce.tr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jforce.tr.modal.Exam;
import com.jforce.tr.repository.ExamRepository;

@Service
public class ExamServiceImpl implements ExamService {
	@Autowired
	ExamRepository examRepository;

	@Override
	public List<Exam> getList() {
		return examRepository.findAll();
	}

}