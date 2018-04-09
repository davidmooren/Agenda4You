package com.agenda.grupocuatro.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.agenda.grupocuatro.dao.UsuarioAdminDAO;
import com.agenda.grupocuatro.dao.UsuarioAdminDAOImpl;
import com.agenda.grupocuatro.model.UsuarioAdmin;

@Service
@Transactional
public class UsuarioAdminServiceImpl implements UsuarioAdminService {

	@Autowired
	UsuarioAdminDAO usuarioAdminDAO;
	
	
	@Override
	public UsuarioAdmin login(String nombre, String password) {
		return usuarioAdminDAO.login(nombre, password);
		
	}

	
	
}
