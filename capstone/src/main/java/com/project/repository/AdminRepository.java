package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer> {

	public Admin findByName(String name);
	public Admin findByPwd(String pwd);
	public Admin findByNameAndPwd(String name, String pwd);
	public boolean existsByEmailId(String emailId);
}
