package com.globallogic.examSystem.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.globallogic.examSystem.entity.Admin;

@Service
public interface AdminService {
	
	 abstract public List<Admin> getAdmin();
	 
	 abstract public List<Admin> addAdmin(Admin admin);
	 
	 abstract public void updateAdmin(Admin admin);
	 
	 abstract public void deleteAdmin(long id);
		
	

}
