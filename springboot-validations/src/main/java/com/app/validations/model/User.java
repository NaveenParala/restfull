package com.app.validations.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
@Entity
@Table(name = "user_tab2")
public class User {

	@Id
	@GeneratedValue
	@Column(length = 5)
	private int id;
	
	@Column(length = 20)
	@NotEmpty
	@Size(min = 2,message = "name should be 2 or more than 2 characters")
	private String userName;
	
	@Column(length = 25)
	@NotEmpty
	@Email
	private String email;
	
	@Column(length = 15)
	@NotEmpty
	@Size(min = 8,max = 15,message = "password should be in the range between 8-15 characters")
	private String password;

	public User() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

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
