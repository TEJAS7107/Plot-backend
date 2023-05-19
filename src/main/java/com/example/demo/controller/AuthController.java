package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Authentication;
import com.example.demo.repo.Auth;
@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("api/v0/")
public class AuthController {
	
	@Autowired
	Auth aa;
	
	@PostMapping("/credentials")
	public List<Authentication> getAuthentication(@RequestBody Authentication ar) {
		return aa.findAll();
	}
	@GetMapping("/credentialss")
	public List<Authentication> getAuthenticationn() {
		return aa.findAll();
	}
	@GetMapping(" ")
	public List <Authentication> getinfo(){
		
		
		List<Authentication> temp = aa.findAll();
		
		return temp;
		
	}

}
