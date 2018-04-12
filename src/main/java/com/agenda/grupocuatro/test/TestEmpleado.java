package com.agenda.grupocuatro.test;

import java.util.List;

import com.agenda.grupocuatro.model.Empleado;

public class TestEmpleado {

	public static boolean salarioCorrecto(List<Empleado> lista){
		
		boolean correcto = true;
		
		for(int i=0; i<lista.size() && correcto; i++){
			if(lista.get(i).getSalario() < 0){
				correcto = false;
			}
		}
		
		return correcto;
		
	}
	

}