package com.enesbayram.main;

import java.util.Date;

import com.enesbayram.controller.abstracts.IUserService;
import com.enesbayram.controller.concretes.UserController;
import com.enesbayram.core.concretes.LogServiceAdapter;
import com.enesbayram.core.concretes.SmsValidator;
import com.enesbayram.entities.concretes.User;
import com.enesbayram.repository.concretes.UserRepositoryImpl;

public class Main {

	public static void main(String[] args) {
		
		IUserService userController = new UserController(new UserRepositoryImpl(), new LogServiceAdapter(), new SmsValidator());
		User user = new User(1L, new Date(), "Enes", "Bayram", "enes.bayram@jforce.com", "05555555", "123123123");
		userController.register(user);
		
		userController.login(user.getEmail(), user.getPassword());
	}
}
