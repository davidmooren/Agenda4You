package com.ejemplos.spring.model;

public abstract class Usuario {

	private String usuario;
	private String pass;
	private boolean logueado;

	public Usuario() {

	}

	public Usuario(String usuario, String pass, boolean logueado) {

		this.usuario = usuario;
		this.pass = pass;
		this.logueado = logueado;

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

	public boolean isLogueado() {
		return logueado;
	}

	public void setLogueado(boolean logueado) {
		this.logueado = logueado;
	}
	
}
