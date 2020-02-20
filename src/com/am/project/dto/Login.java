package com.am.project.dto;

import java.io.Serializable;

public class Login implements Serializable {

	private Long contact;
	private String email;

	public Login() {
		// TODO Auto-generated constructor stub
	}

	public Long getContact() {
		return contact;
	}

	public void setContact(Long contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
