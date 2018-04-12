package com.agenda.grupocuatro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.agenda.grupocuatro.dao.PersonasDAO;
import com.agenda.grupocuatro.model.Personas;

@Service
@Transactional
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

	@Override
	public Personas usuarioPorCodEmpleado(String codEmpleado) {
				return personasDAO.usuarioPorCodEmpleado(codEmpleado);
	}

	@Override
	public List<Personas> usuarioPorDepartamento(String idDepartamento) {
		return personasDAO.usuarioPorDepartamento(idDepartamento);
		
	}	
	
}
