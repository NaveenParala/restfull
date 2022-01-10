package com.app.validations.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.validations.exception.UserRecordNotFindException;
import com.app.validations.model.User;
import com.app.validations.repository.UserRepository;



@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;

	public User  saveUser(User user) {
		
	User user1=repository.save(user);
	//int id=user1.getId();
		return user1;
	}

	public List<User> fetchAll() {
		return  repository.findAll();
		
	}

	public User getUserById(int id) {
		
		Optional<User> optional=repository.findById(id);
		return optional.orElseThrow(()-> new UserRecordNotFindException("record not found with this id"));
	
	}
}
