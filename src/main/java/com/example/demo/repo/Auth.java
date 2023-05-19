package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Authentication;

public interface Auth extends JpaRepository<Authentication, Long> {
	
}
