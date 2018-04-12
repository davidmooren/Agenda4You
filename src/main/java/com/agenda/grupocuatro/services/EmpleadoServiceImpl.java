package com.agenda.grupocuatro.services;

import java.util.List;

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

	@Override
	public List<Empleado> listaEmpleados() {
		return empleadoDAO.testListaEmpleados();
	}

	@Override
	public boolean altaOupdate(Empleado empleado) {
		return empleadoDAO.altaOupdate(empleado);
	}

	@Override
	public void baja(int idEmpleado) {
		empleadoDAO.baja(idEmpleado);
	}

	@Override
	public Empleado get(int id) {	
		return empleadoDAO.get(id);
	}

	@Override
	public List<Empleado> listaEmpleadosSinPersona() {
		return empleadoDAO.listaEmpleadosSinPersona();
	}
	
	

}


