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
		return empleadoDAO.listaEmpleados();
	}

	@Override
	public void altaOupdate(Empleado empleado) {
		// TODO Auto-generated method stub
	}

	@Override
	public void baja(int idEmpleado) {
		// TODO Auto-generated method stub
		
	}
	
	

}


