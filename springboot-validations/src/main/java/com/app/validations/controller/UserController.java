package com.app.validations.controller;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Min;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.validations.model.User;
import com.app.validations.service.UserService;


@RestController
@RequestMapping("/api")
@Validated
public class UserController {

	@Autowired
	private UserService service;
	
	@GetMapping("/")
	public List<User> getAllUser(){
		return service.fetchAll();
	}
	
	@GetMapping("/find/{id}")
	public User getOne(@PathVariable @Min(1) int id){
		return service.getUserById(id);
		 
	}
	@PostMapping("/save")
	public ResponseEntity<User> postUser(@Valid @RequestBody User user) {
		
		User savedUser= service.saveUser(user);
		return new ResponseEntity<User>(savedUser, HttpStatus.CREATED);
	}
}
