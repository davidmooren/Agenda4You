package com.agenda.grupocuatro.services;

import com.agenda.grupocuatro.model.UsuarioAdmin;

public interface UsuarioAdminService {

	UsuarioAdmin login(String nombre, String password);
}
