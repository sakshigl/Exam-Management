package com.globallogic.examSystem.Service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.globallogic.examSystem.entity.Exam;

@Service
public interface ExamService {
	
	abstract public List<Exam> getExam();
	 
	 abstract public List<Exam> addExam(Exam exam);
	 
	
	 

}
