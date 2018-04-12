package com.agenda.grupocuatro.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agenda.grupocuatro.dao.CategoriasDAO;

import com.agenda.grupocuatro.model.Categorias;


@Service
@Transactional
public class CategoriasServiceImpl implements CategoriasService {

	@Autowired
	private CategoriasDAO categoriaDAO;

	@Override
	public void altaOupdate(Categorias categoria) {
		 categoriaDAO.altaOupdate(categoria);
		 
	}

	@Override
	public void baja(int id) {
		 categoriaDAO.baja(id);
		
	}

	@Override
	public List<Categorias> listaCaterogias() {
		return categoriaDAO.listaCaterogias();
	}

	@Override
	public Categorias get(int id) {		
		return  categoriaDAO.get(id);
	}

	
	


	
}
