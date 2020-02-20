package com.am.project.controller;

import javax.swing.text.html.FormSubmitEvent.MethodType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.am.project.dto.Register;
import com.am.project.model.service.RegisterService;

@Controller
public class RegitserController {

	@Autowired
	private RegisterService registerService;

	@PostMapping(name = "/register")
	public ModelAndView saveRegitserData(Register regitser) {
		registerService.saveRegitserData(regitser);
		return new ModelAndView("register.jsp");
	}
}
