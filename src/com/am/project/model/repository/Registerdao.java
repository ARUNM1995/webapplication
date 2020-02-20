package com.am.project.model.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.am.project.dto.Register;

@Repository
public class Registerdao {

	@Autowired
	private SessionFactory sessionFactory;

	public void saveRegitserData(Register regitser) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(regitser);
		transaction.commit();
	}
}
