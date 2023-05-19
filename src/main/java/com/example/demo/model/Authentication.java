package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "Authentication")
public class Authentication {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private long id;
	@Id
	@Column (name = "username")
	private String email;
	@Column (name = "password")
	private String password;
	
	
	
	
	public Authentication() {
		// TODO Auto-generated constructor stub
	}
	
//	public long getId() {
//		return id;
//	}
//	public void setId(long id) {
//		this.id = id;
//	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

	
	

}
