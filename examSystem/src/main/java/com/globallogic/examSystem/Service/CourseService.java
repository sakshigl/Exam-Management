package com.globallogic.examSystem.Service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.globallogic.examSystem.entity.Course;

@Service
public interface CourseService {
	
     abstract public List<Course> getCourse();
	 
	 abstract public List<Course> addCourse(Course course);
	 
	 abstract public void updateCourse(Course course);
	 
	 abstract public void deleteCourse(long id);

}
