package com.am.project.model.repository;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.am.project.dto.Login;
import com.am.project.dto.Register;

@Repository
public class Logindao {

	@Autowired
	private SessionFactory sessionFactory;

	public Register getByEmailAndContact(Login login) {

		String hql = "from Register where email=:e and contact=:c";
		Session session = sessionFactory.openSession();
		Query query = session.createQuery(hql);
		query.setParameter("e", login.getEmail());
		query.setParameter("c", login.getContact());
		Register register = (Register) query.uniqueResult();
		return register;
	}
}
