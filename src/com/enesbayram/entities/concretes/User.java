package com.enesbayram.entities.concretes;

import java.util.Date;

import com.enesbayram.entities.abstracts.BaseEntity;

public class User extends BaseEntity{

	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String password;
	
	public User() {
	}

	public User(Long id,Date createDate,String firstName, String lastName, String email,String phoneNumber, String password) {
		setId(id);
		setCreateDate(createDate);
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.phoneNumber = phoneNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
