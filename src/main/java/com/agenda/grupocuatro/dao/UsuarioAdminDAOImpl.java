package com.agenda.grupocuatro.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.jboss.logging.Logger;
import org.jboss.logging.Logger.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.agenda.grupocuatro.model.UsuarioAdmin;


@Repository
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
		
		Logger milog = Logger.getLogger(UsuarioAdminDAOImpl.class);
		milog.log(Level.WARN, "paso por aqui gilipollas los dos");
		
		
		String hql = "from UsuarioAdmin where usuario = '" + nombre + "' AND pass = '"+password +"'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<UsuarioAdmin> admin = (List<UsuarioAdmin>) query.list();
		
		if (admin != null && !admin.isEmpty()) {
			return admin.get(0);
		}
		
		return null;
	}

}
