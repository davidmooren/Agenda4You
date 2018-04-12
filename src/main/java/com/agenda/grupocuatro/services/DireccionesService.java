package com.agenda.grupocuatro.services;

import java.util.List;
import com.agenda.grupocuatro.model.Direcciones;

public interface DireccionesService {
	
	public void altaOupdate (Direcciones direccion);
	public void baja (int id);
	public List<Direcciones> listaDirecciones();
	public Direcciones get (int id);
	

}
