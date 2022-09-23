package com.enesbayram.core.concretes;

import com.enesbayram.core.abstracts.ILogService;
import com.enesbayram.log.concretes.LogManager;

public class LogServiceAdapter implements ILogService{

	@Override
	public void logToSystem(String message) {
		LogManager logManager = new LogManager();
		logManager.log(message);
	}

}
