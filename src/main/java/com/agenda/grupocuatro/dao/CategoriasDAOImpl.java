package com.agenda.grupocuatro.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.agenda.grupocuatro.model.Categorias;
import com.agenda.grupocuatro.model.Contact;
import com.agenda.grupocuatro.model.Empleado;


@Repository
public class CategoriasDAOImpl implements CategoriasDAO {
	

	@Autowired
	private SessionFactory sessionFactory;

	
	public CategoriasDAOImpl() {
		
	}
	
	public CategoriasDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	@Override
	public void altaOupdate(Categorias categoria) {
		sessionFactory.getCurrentSession().saveOrUpdate(categoria);
	}

	@Transactional
	@Override
	public void baja(int id) {
		Categorias categoriaABorrar = new Categorias();
		categoriaABorrar.setIdCategorias(id);
		sessionFactory.getCurrentSession().delete(categoriaABorrar);
		
	}

	@Transactional
	@Override
	public List<Categorias> listaCaterogias() {
		String hql = "from Categorias";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<Categorias> categorias = (List<Categorias>) query.list();
		
		if (categorias != null && !categorias.isEmpty()) {
			return categorias;
		}		
		
		return null;
	}

	@Override
	public Categorias get(int id) {
		String hql = "from Categorias where idcategorias=" + id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		Categorias categoria = (Categorias) query.uniqueResult();
		
		if (categoria != null) {
			return categoria;
		}
		
		return null;
	}



	

}
