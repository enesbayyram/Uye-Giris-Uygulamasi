package com.enesbayram.core.concretes;

import com.enesbayram.core.abstracts.BaseValidator;
import com.enesbayram.entities.concretes.User;

public class SmsValidator extends BaseValidator{

	@Override
	public void sendValidate(User user) {
		int validateCode = createValidateCode();
		System.out.println(user.getPhoneNumber() +" telefonuna " + validateCode +" doğrulama kodu gönderilmiştir.");
	}

}
