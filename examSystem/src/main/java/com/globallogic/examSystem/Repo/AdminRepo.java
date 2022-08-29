package com.globallogic.examSystem.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.examSystem.entity.Admin;

public interface AdminRepo extends JpaRepository<Admin, Long>{

}
