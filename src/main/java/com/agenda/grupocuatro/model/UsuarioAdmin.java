package com.agenda.grupocuatro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuarioadmin")
public class UsuarioAdmin  {

	@Id
	@GeneratedValue
	private int idAdmin;
	private String usuario;
	private String pass;
	
	
	public UsuarioAdmin(){	}
		

	public UsuarioAdmin(int idAdmin, String usuario, String pass) {
		this.idAdmin = idAdmin;
		this.usuario = usuario;
		this.pass = pass;
	}


	public int getIdAdmin() {
		return idAdmin;
	}

	public void setIdAdmin(int idAdmin) {
		this.idAdmin = idAdmin;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
}
