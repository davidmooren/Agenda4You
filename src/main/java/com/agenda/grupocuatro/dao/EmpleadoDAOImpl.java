package com.agenda.grupocuatro.dao;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.agenda.grupocuatro.model.Empleado;
import com.agenda.grupocuatro.test.Test;

import junit.framework.TestCase;

@Repository
public class EmpleadoDAOImpl extends TestCase implements EmpleadoDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	public EmpleadoDAOImpl() {
		
	}
	
	public EmpleadoDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	@Transactional
	public List<Empleado> listaEmpleados() {

		String hql = "from Empleado";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<Empleado> empleados = (List<Empleado>) query.list();
		
		public void testSalario(){
			assertEquals(true, Test.salarioCorrecto(empleados));
		}
		
		if (empleados != null && !empleados.isEmpty()) {
			return empleados;
		}		
		
		return null;
	}

}
