package com.agenda.grupocuatro.services;

import java.util.List;

import com.agenda.grupocuatro.model.Departamento;

public interface DepartamentoService {

	List<Departamento> listaDepartamentos();
	
	void altaOupdate(Departamento departamento);
	
	void baja(int idDepartamento);
	
}
