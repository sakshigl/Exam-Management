package com.globallogic.examSystem.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.examSystem.entity.Course;

public interface CourseRepo extends JpaRepository<Course,Long> {

}
