package com.agenda.grupocuatro.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.agenda.grupocuatro.model.Telefonos;

@Repository
public class TelefonosDAOImpl implements TelefonosDAO{

	@Autowired
	private SessionFactory sessionFactory;

	
	public TelefonosDAOImpl() {
		
	}
	
	public TelefonosDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	@Override
	public void altaOupdate(Telefonos telefonos) {
		sessionFactory.getCurrentSession().saveOrUpdate(telefonos);
	}

	@Transactional
	@Override
	public void baja(int id) {
		Telefonos categoriaABorrar = new Telefonos();
		categoriaABorrar.setIdtelefonos(id);
		sessionFactory.getCurrentSession().delete(categoriaABorrar);
		
	}

	@Transactional
	@Override
	public List<Telefonos> listaTelefonos() {
		String hql = "from Telefonos";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<Telefonos> telefonos = (List<Telefonos>) query.list();
		
		if (telefonos != null && !telefonos.isEmpty()) {
			return telefonos;
		}		
		
		return null;
	}

	@Transactional
	@Override
	public Telefonos get(int id) {
		String hql = "from Categorias where idcategorias=" + id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		Telefonos categoria = (Telefonos) query.uniqueResult();
		
		if (categoria != null) {
			return categoria;
		}
		
		return null;
	}
	
	
	
}
