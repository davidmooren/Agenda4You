package com.ejemplos.spring.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ejemplos.spring.model.Contact;
import com.ejemplos.spring.model.UsuarioAdmin;

@Service
@Transactional
public class UsuarioAdminDAOImpl implements UsuarioAdminDAO {
	

	@Autowired
	private SessionFactory sessionFactory;

	
	public UsuarioAdminDAOImpl() {
		
	}
	
	public UsuarioAdminDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
	@Override
	@Transactional
	public UsuarioAdmin login(String nombre, String password) {
		String hql = "from Admin where name=" + nombre + " and password = "+password;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		UsuarioAdmin admin = (UsuarioAdmin) query.list();
		
		if (admin != null) {
			return admin;
		}
		
		return null;
	}

}
