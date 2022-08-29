package com.globallogic.examSystem.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.examSystem.entity.Exam;

public interface ExamRepo extends JpaRepository<Exam, Long> {

}
