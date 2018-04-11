package com.agenda.grupocuatro.services;

import java.util.List;

import com.agenda.grupocuatro.model.Categorias;


public interface CategoriasService {

	void altaOupdate(Categorias categoria);
	void baja(int id);
	List<Categorias> listaCaterogias();

}
