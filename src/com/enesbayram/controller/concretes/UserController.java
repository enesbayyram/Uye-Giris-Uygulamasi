package com.enesbayram.controller.concretes;

import com.enesbayram.controller.abstracts.IUserService;
import com.enesbayram.core.abstracts.BaseValidator;
import com.enesbayram.core.abstracts.ILogService;
import com.enesbayram.entities.concretes.User;
import com.enesbayram.repository.abstracts.IUserRepository;
import com.enesbayram.utilities.strings.StringUtility;

public class UserController implements IUserService{
	
	private IUserRepository userRepository;
	private ILogService logService;
	private BaseValidator validator;
	
	public UserController(IUserRepository userRepository , ILogService logService , BaseValidator validator) {
		this.userRepository = userRepository;
		this.logService = logService;
		this.validator = validator;
	}

	@Override
	public void register(User user) {
		if(checkUser(user)) {
			userRepository.register(user);
			validator.sendValidate(user);
			logService.logToSystem("Loglama yapıldı . Veritabanına "+ user.getFirstName() +" adlı kişi eklendi");
		}else {
			System.out.println("Kullanıcı eklenemedi.");
			logService.logToSystem("Loglama yapıldı . Veritabanına "+ user.getFirstName() +" adlı kişi eklenirken hata oluştu");
		}
	}

	@Override
	public void login(String email, String password) {
		if(!StringUtility.isNullOrEmpty(email) && !StringUtility.isNullOrEmpty(password)) {
			boolean result =  userRepository.login(email, password);
			if(result) {
				System.out.println("Sisteme giriş yapılmıştır");
			}else {
				System.out.println("Hatalı bilgi!");
			}
		}else {
			System.out.println("Tüm alanları doldurunuz.");
		}
	}

	@Override
	public boolean checkUser(User user) {
		if(user.getPassword().length()<6) {
			System.out.println("Parola 6 karakterden az olamaz!");
			return false;
		}
		if(user.getFirstName().length()<2 && user.getLastName().length()<2) {
			System.out.println("İsim ve soyisim 2 karakterden uzun olmalıdır!");
			return false;
		}
		return true;
	}

}
