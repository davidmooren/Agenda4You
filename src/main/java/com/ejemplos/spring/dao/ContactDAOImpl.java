package com.ejemplos.spring.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ejemplos.spring.model.Contact;

@Repository
public class ContactDAOImpl implements ContactDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	public ContactDAOImpl() {
		
	}
	
	public ContactDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public List<Contact> list() {
		@SuppressWarnings("unchecked")
		List<Contact> listUser = (List<Contact>) sessionFactory.getCurrentSession()
				.createCriteria(Contact.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listUser;
	}

	@Override
	@Transactional
	public void saveOrUpdate(Contact user) {
		sessionFactory.getCurrentSession().saveOrUpdate(user);
	}

	@Override
	@Transactional
	public void delete(int id) {
		Contact userToDelete = new Contact();
		userToDelete.setId(id);
		sessionFactory.getCurrentSession().delete(userToDelete);
	}

	@Override
	@Transactional
	public Contact get(int id) {
		String hql = "from Contact where idcontacto=" + id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<Contact> listUser = (List<Contact>) query.list();
		
		if (listUser != null && !listUser.isEmpty()) {
			return listUser.get(0);
		}
		
		return null;
	}

	@Override
	@Transactional
	public List<Contact> search(String selector) {
		
		String hql = "from Contact where nombre LIKE '" + selector +"%'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<Contact> listUser = (List<Contact>) query.list();
		
		if (listUser != null && !listUser.isEmpty()) {
			return listUser;
		}
		
		return null;
	}
}