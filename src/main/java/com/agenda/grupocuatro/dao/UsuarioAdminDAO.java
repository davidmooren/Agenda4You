package com.agenda.grupocuatro.dao;

import com.agenda.grupocuatro.model.UsuarioAdmin;

public interface UsuarioAdminDAO {

	UsuarioAdmin login(String nombre, String password);
}
