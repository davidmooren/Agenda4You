package com.agenda.grupocuatro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.agenda.grupocuatro.dao.TelefonosDAO;
import com.agenda.grupocuatro.model.Telefonos;

@Service
@Transactional
public class TelefonosServiceImpl implements TelefonosService{
	
		
		@Autowired
		private TelefonosDAO telefonosDAO;

		@Override
		public void altaOupdate(Telefonos telefonos) {
			 telefonosDAO.altaOupdate(telefonos);
			 
		}

		@Override
		public void baja(int id) {
			 telefonosDAO.baja(id);
			
		}

		@Override
		public List<Telefonos> listaTelefonos() {
			return telefonosDAO.listaTelefonos();
		}

		@Override
		public Telefonos get(int id) {		
			return  telefonosDAO.get(id);
	}

}
