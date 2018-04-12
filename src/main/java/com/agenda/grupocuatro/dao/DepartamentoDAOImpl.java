package com.agenda.grupocuatro.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.agenda.grupocuatro.model.Departamento;

@Repository
public class DepartamentoDAOImpl implements DepartamentoDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	@Override
	public List<Departamento> listaDepartamentos() {
		
		String hql = "from Departamento";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<Departamento> departamentos = (List<Departamento>) query.list();
		
		if(departamentos != null && !departamentos.isEmpty()){
			return departamentos;
		}
		
		return null;
	}

	@Transactional
	@Override
	public void altaOupdate(Departamento departamento) {
		
		sessionFactory.getCurrentSession().saveOrUpdate(departamento);
		
	}

	@Transactional
	@Override
	public void baja(int idDepartamento) {

		Departamento departamentoABorrar = new Departamento();
		departamentoABorrar.setIddepartamento(idDepartamento);
		sessionFactory.getCurrentSession().delete(departamentoABorrar);
		
	}

	@Transactional
	@Override
	public Departamento get(int id) {
		
		String hql = "from Departamento where iddepartamento=" +id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		Departamento departamento = (Departamento) query.uniqueResult();
		
		if(departamento != null){
			return departamento;
		}
		
		return null;
	}

	@Override
	@Transactional
	public List<Departamento> listaDepartamentos(String nombre) {
		
		String hql = "from Departamento WHERE nombre = " + nombre;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<Departamento> departamentos = (List<Departamento>) query.list();
		
		if(departamentos != null && !departamentos.isEmpty()){
			return departamentos;
		}
		
		return null;
	}

}
