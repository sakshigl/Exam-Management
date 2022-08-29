package com.globallogic.examSystem.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.globallogic.examSystem.entity.Student;

@Service
public interface StudentService {
    
	
	 abstract public List<Student> getStudent();
	 
	 abstract public List<Student> getStudentByName(String name);
	 
	 abstract public List<Student> addStudent(Student student);
	 
	 abstract public void updateStudent(Student student);
	 
	 abstract public void deleteStudent(long id);

}
