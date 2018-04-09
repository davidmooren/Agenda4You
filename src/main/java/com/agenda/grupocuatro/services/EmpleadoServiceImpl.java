package com.agenda.grupocuatro.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agenda.grupocuatro.model.Empleado;
import com.agenda.grupocuatro.dao.EmpleadoDAO;

@Service
@Transactional
public class EmpleadoServiceImpl implements EmpleadoService {

	@Autowired
	EmpleadoDAO empleadoDAO;
	
	@Autowired
	public Empleado listaEmpleados() {		
		return empleadoDAO.listaEmpleados();
	}

}
