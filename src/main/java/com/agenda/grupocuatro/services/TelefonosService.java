package com.agenda.grupocuatro.services;

import java.util.List;

import com.agenda.grupocuatro.model.Telefonos;

public interface TelefonosService {

	public void altaOupdate(Telefonos telefono);
	public	void baja(int id);
	public List<Telefonos> listaTelefonos();	
	public Telefonos get(int id);
}
