package com.ejemplos.spring.dao;

import com.ejemplos.spring.model.UsuarioAdmin;

public interface UsuarioAdminDAO {

	UsuarioAdmin login(String nombre, String password);
}
