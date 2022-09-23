package com.enesbayram.core.concretes;

import com.enesbayram.core.abstracts.BaseValidator;
import com.enesbayram.entities.concretes.User;

public class EmailValidator extends BaseValidator{

	@Override
	public void sendValidate(User user) {
		int validateCode = createValidateCode();
		System.out.println(user.getEmail() +" adresine " + validateCode + " doğrulama kodu gönderildi");
	}

}
