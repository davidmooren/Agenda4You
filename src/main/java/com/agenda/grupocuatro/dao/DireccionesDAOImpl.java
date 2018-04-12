package com.agenda.grupocuatro.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.agenda.grupocuatro.model.Direcciones;;




@Repository
public class DireccionesDAOImpl implements DireccionesDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public DireccionesDAOImpl() {
	}
	public DireccionesDAOImpl (SessionFactory sessionFactory) {
		this.sessionFactory =sessionFactory;
	
	}
	
	
	@Transactional
	@Override
	public void altaOupdate(Direcciones direccion) {
		sessionFactory.getCurrentSession().saveOrUpdate (direccion);
		
	}
	
	@Transactional
	@Override
	public void baja(int id) {
		Direcciones direccionABorrar= new Direcciones();
		direccionABorrar.setIddirecciones(id);
		sessionFactory.getCurrentSession().delete(direccionABorrar);		
	}
	
	@Transactional
	@Override
	public List<Direcciones> listaDirecciones() {
		String hql= "from Direcciones";
		Query query= sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings ("unchecked")
		List<Direcciones> direcciones= (List<Direcciones>)query.list();
		if (direcciones !=null && !direcciones.isEmpty()) {
			return direcciones;
			}
		return null;
	}
	
	@Transactional
	@Override
	public Direcciones get(int id) {
		String hql= "from Direcciones where iddirecciones="+id;
		Query query= sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings ("unchecked")
		Direcciones direcciones= (Direcciones)query.list();
		if (direcciones !=null) {
			return direcciones;
			}
		
		return null;
	}

	
}





