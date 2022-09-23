package com.enesbayram.repository.concretes;

import com.enesbayram.entities.concretes.User;
import com.enesbayram.repository.abstracts.IUserRepository;

public class UserRepositoryImpl implements IUserRepository{

	@Override
	public void register(User user) {
		System.out.println(user.getFirstName() +" adlı kullanıcı sisteme başarıyla eklenmiştir.");
	}

	@Override
	public boolean login(String email, String password) {
		return true;
	}

}
