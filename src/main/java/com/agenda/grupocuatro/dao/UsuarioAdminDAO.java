package com.agenda.grupocuatro.dao;

import com.agenda.grupocuatro.model.UsuarioAdmin;

public interface UsuarioAdminDAO {

	public UsuarioAdmin login(String nombre, String password);
}
