package com.agenda.grupocuatro.services;

import java.util.List;

import com.agenda.grupocuatro.model.Empleado;

public interface EmpleadoService {

	List<Empleado> listaEmpleados();
	
	
	void altaOupdate(Empleado empleado);
	
	
	void baja (int idEmpleado);
}
