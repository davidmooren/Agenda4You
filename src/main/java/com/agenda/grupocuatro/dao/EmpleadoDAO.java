package com.agenda.grupocuatro.dao;

import java.util.List;

import com.agenda.grupocuatro.model.Empleado;

public interface EmpleadoDAO {
	
	public List<Empleado> listaEmpleados();

	void altaOupdate(Empleado empleado);
		
	void baja(int idEmpleado);
}
