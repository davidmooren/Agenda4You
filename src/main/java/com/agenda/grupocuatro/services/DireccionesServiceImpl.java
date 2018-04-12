package com.agenda.grupocuatro.services;

import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agenda.grupocuatro.dao.DireccionesDAO;
import com.agenda.grupocuatro.model.Direcciones;

@Service
@Transactional

public class DireccionesServiceImpl implements DireccionesService {

	
	@Autowired
	private DireccionesDAO direccionDAO;
	
	@Override
	public void altaOupdate(Direcciones direccion) {
		direccionDAO.altaOupdate(direccion);
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void baja(int id) {
		direccionDAO.baja(id);
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Direcciones> listaDirecciones() {
		return direccionDAO.listaDirecciones();
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public Direcciones get(int id) {
		return direccionDAO.get(id);
		// TODO Auto-generated method stub
		
	}

	
	
}
