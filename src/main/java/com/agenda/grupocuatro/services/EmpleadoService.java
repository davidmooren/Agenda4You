package com.agenda.grupocuatro.services;

import java.util.List;


import com.agenda.grupocuatro.model.Empleado;

public interface EmpleadoService {

	public List<Empleado> listaEmpleados();
	
	
	public boolean altaOupdate(Empleado empleado);
	
	
	public void baja (int idEmpleado);
	
	public Empleado get(int id);


	public List<Empleado> listaEmpleadosSinPersona();
	
	public List<Empleado> listaEmpleados(String codigo);
}
