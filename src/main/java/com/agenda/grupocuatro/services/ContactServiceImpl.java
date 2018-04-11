package com.agenda.grupocuatro.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agenda.grupocuatro.dao.ContactDAO;
import com.agenda.grupocuatro.model.Contact;

@Service
@Transactional
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactDAO contactDAO;
	
	/*
	public UserServiceImpl(){
		
	}
	
	public UserServiceImpl(UserDAO userDAO) {
		super();
		this.userDAO = userDAO;
	}
	*/


	@Override
	public List<Contact> list() {

		return contactDAO.list();
	}

	@Override
	public Contact get(int id) {
		return contactDAO.get(id);
	}

	@Override
	public void saveOrUpdate(Contact user) {
		contactDAO.saveOrUpdate(user);

	}

	@Override
	public void delete(int id) {
		contactDAO.delete(id);

	}

	@Override
	public List<Contact> search(String l) {
		
		return contactDAO.search(l);
	}
	

}
