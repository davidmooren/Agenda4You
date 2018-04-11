package com.agenda.grupocuatro.services;

import java.util.List;

import com.agenda.grupocuatro.model.Contact;

public interface ContactService {
	public List<Contact> list();
	
	public Contact get(int id);
	
	public void saveOrUpdate(Contact user);
	
	public void delete(int id);
	
	public List<Contact> search(String l);
}