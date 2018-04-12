package com.agenda.grupocuatro.dao;

import java.util.List;

import com.agenda.grupocuatro.model.Personas;


public interface PersonasDAO {

	public Personas get(int id);
	public List<Personas> listaPersonas();	
	public void altaOupdate(Personas persona);
	public	void baja(int id);
	public Personas usuarioPorCodEmpleado(String codEmpleado);
}
