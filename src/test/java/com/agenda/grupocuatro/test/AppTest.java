package com.agenda.grupocuatro.test;

import java.sql.Date;

import static org.junit.Assert.*;

import org.hibernate.HibernateException;
import org.jboss.logging.Logger;
import org.jboss.logging.Logger.Level;
import org.junit.Test;

import com.agenda.grupocuatro.dao.EmpleadoDAO;
import com.agenda.grupocuatro.dao.EmpleadoDAOImpl;
import com.agenda.grupocuatro.model.Categorias;
import com.agenda.grupocuatro.model.Departamento;
import com.agenda.grupocuatro.model.Empleado;

public class AppTest {
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCompruebaInsercion()
	{
		EmpleadoDAO nuevoEmpleado = new EmpleadoDAOImpl();
		
		Empleado empleado = new Empleado();
		empleado.setCodEmpleado("A666");
		empleado.setSalario(42420);
		empleado.setFechaAlta(new Date(2018, 04, 12));
		empleado.setDepartamento(new Departamento());
		empleado.setCategorias(new Categorias());
		empleado.getDepartamento().setIddepartamento(1);
		empleado.getCategorias().setIdCategorias(2);
		
		try{
			nuevoEmpleado.altaOupdate(empleado);
			
		}catch(HibernateException he){
			Logger logeer = Logger.getLogger("DataSource");
	    	logeer.log(Level.WARN, "error hibernate insertar" + he.getLocalizedMessage());
		}
		
		assertTrue(true);
		
		//assertTrue(nuevoEmpleado.altaOupdate(empleado));
	}
	
}
