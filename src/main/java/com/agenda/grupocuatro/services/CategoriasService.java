package com.agenda.grupocuatro.services;

import java.util.List;

import com.agenda.grupocuatro.model.Categorias;



public interface CategoriasService {

	public void altaOupdate(Categorias categoria);
	public	void baja(int id);
	public List<Categorias> listaCaterogias();	
	public Categorias get(int id);
	
	public List<Categorias> listaCategorias(String nombre);

}
