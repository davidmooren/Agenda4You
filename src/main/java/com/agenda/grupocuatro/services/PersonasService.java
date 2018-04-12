package com.agenda.grupocuatro.services;

import java.util.List;
import com.agenda.grupocuatro.model.Personas;

public interface PersonasService {

	public Personas get(int id);
	public List<Personas> listaPersonas();	
	public void altaOupdate(Personas persona);
	public	void baja(int id);
	public Personas usuarioPorCodEmpleado(String parameter);
	public List<Personas> usuarioPorDepartamento(String parameter);
	
	
}
