package com.enesbayram.repository.abstracts;

import com.enesbayram.entities.concretes.User;

public interface IUserRepository {

	void register(User user);
	boolean login(String email , String password);
}
