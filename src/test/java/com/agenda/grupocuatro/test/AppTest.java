package com.agenda.grupocuatro.test;

import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest {
	
	@Test
	public void testCompruebaRecuperacion()
	{
		
		String codigoPrueba = "A123";
		
		String codigo = TestEmpleado.codigoCorrecto(1);
		
		assertEquals(codigoPrueba, codigo);
		
	}
	
	
}
