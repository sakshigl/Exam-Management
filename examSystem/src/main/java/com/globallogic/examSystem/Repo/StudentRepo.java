package com.globallogic.examSystem.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.examSystem.entity.Student;

public interface StudentRepo extends JpaRepository<Student,Long> {

	List<Student> findByName(String name);

}
