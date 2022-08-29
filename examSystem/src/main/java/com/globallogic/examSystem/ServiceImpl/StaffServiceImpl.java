package com.globallogic.examSystem.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globallogic.examSystem.Repo.ExamRepo;
import com.globallogic.examSystem.Repo.StaffRepo;
import com.globallogic.examSystem.Repo.StudentRepo;
import com.globallogic.examSystem.Service.StaffService;
import com.globallogic.examSystem.entity.Exam;
import com.globallogic.examSystem.entity.Staff;
import com.globallogic.examSystem.entity.Student;

@Service
public class StaffServiceImpl implements StaffService {
	
	@Autowired
     StaffRepo repo;
	
	@Autowired
	ExamRepo erepo;
	
	@Autowired
	StudentRepo srepo;

	@Override
	public List<Staff> getStaff() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public List<Staff> addStaff(Staff staff) {
		// TODO Auto-generated method stub
		Exam entity=erepo.findById(staff.getExam().getId()).get();
		List<Student> std=new ArrayList<>();
		for(Student s:staff.getStudent()) {
			Student student=srepo.findById(s.getId()).get();
			std.add(student);
		}
		
		staff.setExam(entity);
		staff.setStudent(std);
		repo.save(staff);
		return repo.findAll();
	}

	@Override
	public void updateStaff(Staff staff) {
		// TODO Auto-generated method stub
		repo.save(staff);
		
	}

	@Override
	public void deleteStaff(long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}

}
