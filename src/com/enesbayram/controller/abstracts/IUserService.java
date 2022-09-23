package com.enesbayram.controller.abstracts;

import com.enesbayram.entities.concretes.User;

public interface IUserService {

	void register(User user);
	void login(String email , String password);
	boolean checkUser(User user);
}
