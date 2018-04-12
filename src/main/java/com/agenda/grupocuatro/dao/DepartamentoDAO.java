package com.agenda.grupocuatro.dao;

import java.util.List;

import com.agenda.grupocuatro.model.Departamento;

public interface DepartamentoDAO {

	public List<Departamento> listaDepartamentos();
	
	public void altaOupdate(Departamento departamento);
	
	public void baja(int idDepartamento);
	
	public Departamento get(int id);
	
	public List<Departamento> listaDepartamentos(String nombre);
	
}
