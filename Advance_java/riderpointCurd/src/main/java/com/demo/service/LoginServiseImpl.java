package com.demo.service;

import com.demo.beans.Rider;
import com.demo.dao.LoginDaoimpl;
import com.demo.dao.Logindao;

public class LoginServiseImpl implements LoginServise {
	private Logindao ldao;
	public LoginServiseImpl()
	{
		ldao=new LoginDaoimpl();
	}

	@Override
	public Rider validUser(String uname, String pass) {
		return ldao.validUser(uname, pass);
	}

	
}
