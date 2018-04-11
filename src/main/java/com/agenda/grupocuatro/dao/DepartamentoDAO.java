package com.agenda.grupocuatro.dao;

import java.util.List;

import com.agenda.grupocuatro.model.Departamento;

public interface DepartamentoDAO {

	public List<Departamento> listaDepartamentos();
	
	void altaOupdate(Departamento departamento);
	
	void baja(int idDepartamento);
	
}
