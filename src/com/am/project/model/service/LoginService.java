package com.am.project.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.am.project.dto.Login;
import com.am.project.dto.Register;
import com.am.project.model.repository.Logindao;

@Service
public class LoginService {

	@Autowired
	private Logindao logindao;
	
	public Register getByEmailAndContact(Login login) {
		return logindao.getByEmailAndContact(login);
	}
}
