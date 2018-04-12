package com.agenda.grupocuatro.dao;

import java.util.List;

import com.agenda.grupocuatro.model.Empleado;

public interface EmpleadoDAO {
	
	public List<Empleado> testListaEmpleados();

	public boolean altaOupdate(Empleado empleado);
		
	public void baja(int idEmpleado);
	
	public Empleado get(int id);

	public List<Empleado> listaEmpleadosSinPersona();
	
	public List<Empleado> listaEmpleados(String codigo);
}
