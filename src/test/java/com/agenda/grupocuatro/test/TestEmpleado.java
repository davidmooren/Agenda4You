package com.agenda.grupocuatro.test;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.agenda.grupocuatro.model.Empleado;
import com.agenda.grupocuatro.services.EmpleadoService;
import com.agenda.grupocuatro.services.EmpleadoServiceImpl;

public class TestEmpleado {

	public static String codigoCorrecto(int id)
	{
	
		Logger logger = Logger.getLogger("test logger");
		
		logger.log(Level.INFO, "dentro de test");
		
		EmpleadoService empleadoService = new EmpleadoServiceImpl();
		
		Empleado emp = empleadoService.get(id);
		logger.log(Level.INFO, "get conseguido");
		
		String valor = empleadoService.get(id).getCodEmpleado();
		logger.log(Level.INFO, "todo hecho");
		
		return valor;

	}

}