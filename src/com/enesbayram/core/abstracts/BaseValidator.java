package com.enesbayram.core.abstracts;

import java.util.Random;

import com.enesbayram.entities.concretes.User;

public abstract class BaseValidator {
	
	public abstract void sendValidate(User user);

	public int createValidateCode() {
		Random random = new Random();
		int validateCode =  random.nextInt(1000);
		return validateCode;
		
	}
}
