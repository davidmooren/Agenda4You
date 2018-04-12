package com.agenda.grupocuatro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.agenda.grupocuatro.dao.PersonasDAO;
import com.agenda.grupocuatro.model.Personas;

public class PersonasServiceImpl implements PersonasService {

	@Autowired
	PersonasDAO personasDAO;
	
	
	@Override
	@Transactional
	public Personas get(int id) {	
		return personasDAO.get(id);
	}

	@Override
	@Transactional
	public List<Personas> listaPersonas() {
		return personasDAO.listaPersonas();
	}

	@Override
	@Transactional
	public void altaOupdate(Personas persona) {
		personasDAO.altaOupdate(persona);		
	}

	@Override
	@Transactional
	public void baja(int id) {
		personasDAO.baja(id);
		
	}	
	
}
