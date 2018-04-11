package com.agenda.grupocuatro.dao;

import java.util.List;

import com.agenda.grupocuatro.model.Empleado;

public interface EmpleadoDAO {
	
	public List<Empleado> listaEmpleados();

	public void altaOupdate(Empleado empleado);
		
	public void baja(int idEmpleado);
	
	public Empleado get(int id);
}
