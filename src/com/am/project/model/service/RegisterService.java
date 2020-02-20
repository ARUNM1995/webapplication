package com.am.project.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.am.project.dto.Register;
import com.am.project.model.repository.Registerdao;
@Service
public class RegisterService {

	@Autowired
	private Registerdao registerdao;
	
	public void saveRegitserData(Register regitser) {
		registerdao.saveRegitserData(regitser);
	}
}
