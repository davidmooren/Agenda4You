package com.agenda.grupocuatro.dao;

import java.util.List;

import com.agenda.grupocuatro.model.Categorias;

public interface CategoriasDAO {

	public void altaOupdate(Categorias categoria);

	public void baja(int id);

	public List<Categorias> listaCaterogias();

}
