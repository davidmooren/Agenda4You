package com.agenda.grupocuatro.services;

import java.util.List;

import com.agenda.grupocuatro.model.Departamento;

public interface DepartamentoService {

	public List<Departamento> listaDepartamentos();
	
	public void altaOupdate(Departamento departamento);
	
	public void baja(int idDepartamento);
	
	public Departamento get(int id);
	
	public List<Departamento> listaDepartamentos(String nombre);
	
}
