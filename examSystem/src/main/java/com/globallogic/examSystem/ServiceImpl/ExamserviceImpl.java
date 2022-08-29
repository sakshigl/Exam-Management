package com.globallogic.examSystem.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globallogic.examSystem.Repo.ExamRepo;
import com.globallogic.examSystem.Service.ExamService;
import com.globallogic.examSystem.entity.Exam;

@Service
public class ExamserviceImpl implements ExamService{
	
	@Autowired
	ExamRepo repo;

	@Override
	public List<Exam> getExam() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public List<Exam> addExam(Exam exam) {
		// TODO Auto-generated method stub
		repo.save(exam);
		return repo.findAll();
	}

}
