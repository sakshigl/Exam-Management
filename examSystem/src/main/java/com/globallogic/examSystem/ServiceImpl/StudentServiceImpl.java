package com.globallogic.examSystem.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globallogic.examSystem.Repo.ExamRepo;
import com.globallogic.examSystem.Repo.StudentRepo;
import com.globallogic.examSystem.Service.StudentService;
import com.globallogic.examSystem.entity.Exam;
import com.globallogic.examSystem.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentRepo repo; 
	
	@Autowired
	ExamRepo erepo;

	@Override
	public List<Student> getStudent() {
		// TODO Auto-generated method stub
		
		return repo.findAll();
	}

	@Override
	public List<Student> addStudent(Student student) {
		// TODO Auto-generated method stub
		Exam entity=erepo.findById(student.getExam().getId()).get();
		
		student.setExam(entity);
		repo.save(student);
		return repo.findAll();
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		repo.save(student);
		
	}

	@Override
	public void deleteStudent(long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public List<Student> getStudentByName(String name) {
		// TODO Auto-generated method stub
		
		return repo.findByName(name);
	}

}
