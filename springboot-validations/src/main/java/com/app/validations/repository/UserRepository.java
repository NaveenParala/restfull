package com.app.validations.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.validations.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
