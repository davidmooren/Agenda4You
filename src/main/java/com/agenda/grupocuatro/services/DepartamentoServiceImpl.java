package com.agenda.grupocuatro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.agenda.grupocuatro.model.Departamento;
import com.agenda.grupocuatro.dao.DepartamentoDAO;


@Service
@Transactional
public class DepartamentoServiceImpl implements DepartamentoService {

	@Autowired
	DepartamentoDAO departamentoDAO;
	
	@Override
	public List<Departamento> listaDepartamentos() {
		return departamentoDAO.listaDepartamentos();
	}

	@Override
	public void altaOupdate(Departamento departamento) {
		departamentoDAO.altaOupdate(departamento);
	}

	@Override
	public void baja(int idDepartamento) {
		departamentoDAO.baja(idDepartamento);
	}

	@Override
	public Departamento get(int id) {
		return departamentoDAO.get(id);
	}

	
	
}
