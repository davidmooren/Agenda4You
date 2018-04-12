package com.agenda.grupocuatro.dao;

import com.agenda.grupocuatro.model.Telefonos;
import java.util.List;

public interface TelefonosDAO {
	
	public void altaOupdate(Telefonos telefono);
	
	public void baja(int id);
	
	public List<Telefonos> listaTelefonos();
	
	public Telefonos get(int id);
	

}
