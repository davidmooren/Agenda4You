package com.agenda.grupocuatro.dao;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.jboss.logging.Logger;
import org.jboss.logging.Logger.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.agenda.grupocuatro.model.Empleado;

@Repository
public class EmpleadoDAOImpl implements EmpleadoDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public EmpleadoDAOImpl() {

	}

	public EmpleadoDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public List<Empleado> testListaEmpleados() {

		String hql = "from Empleado";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);

		@SuppressWarnings("unchecked")
		List<Empleado> empleados = (List<Empleado>) query.list();

		if (empleados != null && !empleados.isEmpty()) {
			return empleados;
		}

		return null;
	}

	@Override
	@Transactional
	public boolean altaOupdate(Empleado empleado) throws HibernateException {

		boolean exito = true;

		try {
			sessionFactory.getCurrentSession().saveOrUpdate(empleado);
		} catch (HibernateException he) {
			Logger logeer = Logger.getLogger("DataSource");
	    	logeer.log(Level.WARN, "error hibernate insertar" + he.getLocalizedMessage());
			exito = false;
		}

		return exito;
	}

	@Override
	@Transactional
	public void baja(int idEmpleados) {
		// TODO Auto-generated method stub
		Empleado empleadoABorrar = new Empleado();
		empleadoABorrar.setIdempleados(idEmpleados);
		sessionFactory.getCurrentSession().delete(empleadoABorrar);
	}

	@Override
	@Transactional
	public Empleado get(int id) {
		String hql = "from Empleado where idempleados=" + id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		Empleado empleado = (Empleado) query.uniqueResult();
		if (empleado != null) {
			return empleado;
		}
		return null;
	}

	@Override
	public List<Empleado> listaEmpleadosSinPersona() {
		String sql = "select * from empleados"
				+ " left join personas"
				+ " on personas.idEmpleado = empleados.idempleados"
				+ " where personas.idEmpleado is null;";
		
		
		
		String hql = "	from Empleado as emp left join Persona  as per    WHERE ug.group_id = :groupId       per.idEmpleado is null";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Empleado> empleados = (List<Empleado>) query.list();
		if (empleados != null && !empleados.isEmpty()) {
			return empleados;
		}
		return null;
	}

}
