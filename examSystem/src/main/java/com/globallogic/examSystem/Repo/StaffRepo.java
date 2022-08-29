package com.globallogic.examSystem.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.examSystem.entity.Staff;

public interface StaffRepo extends JpaRepository<Staff,Long> {

}
