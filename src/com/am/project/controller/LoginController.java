package com.am.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.am.project.dto.Login;
import com.am.project.dto.Register;
import com.am.project.model.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@GetMapping(value = "/login")
	public ModelAndView getByEmailAndContact(Login login) {
		System.out.println(login);
		Register register = loginService.getByEmailAndContact(login);
		System.out.println(register);
		if(register!=null) {
			return new ModelAndView("home.jsp");
		}else {
			return new ModelAndView("login.jsp","errorMsg","Invalid credentials");
		}
	}
}
