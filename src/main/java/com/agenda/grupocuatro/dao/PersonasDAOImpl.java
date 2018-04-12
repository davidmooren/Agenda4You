package com.agenda.grupocuatro.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.agenda.grupocuatro.model.Personas;



@Repository
public class PersonasDAOImpl implements PersonasDAO {
	

	@Autowired
	private SessionFactory sessionFactory;

	
	public PersonasDAOImpl() {
		
	}
	
	public PersonasDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public Personas get(int id) {
		String hql = "from Personas where idpersonas=" + id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		Personas persona = (Personas) query.uniqueResult();
		
		if (persona != null) {
			return persona;
		}
		return persona;
		
	}

	@Override
	@Transactional
	public List<Personas> listaPersonas() {

		String hql = "from Personas";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<Personas> personas = (List<Personas>) query.list();
		
		if (personas != null && !personas.isEmpty()) {
			return personas;
		}		
		
		return null;
	}

	@Override
	@Transactional
	public void altaOupdate(Personas persona) {
		sessionFactory.getCurrentSession().saveOrUpdate(persona);		
	}

	@Override
	@Transactional
	public void baja(int id) {
		Personas personaABorrar = new Personas();
		personaABorrar.setIdpersonas(id);
		sessionFactory.getCurrentSession().delete(personaABorrar);
		
	}

	

}
