package com.agenda.grupocuatro.services;

import java.util.List;

import com.agenda.grupocuatro.model.Categorias;
import com.agenda.grupocuatro.model.Contact;


public interface CategoriasService {

	public void altaOupdate(Categorias categoria);
	public	void baja(int id);
	public List<Categorias> listaCaterogias();	
	public Categorias get(int id);

}
