package com.ejemplos.spring.model;

public class UsuarioAdmin extends Usuario {

	private int idAdmin;
	
	public UsuarioAdmin(){
		
	}
	
	public UsuarioAdmin(int idAdmin){
		
		this.idAdmin=idAdmin;
		
	}

	public int getIdAdmin() {
		return idAdmin;
	}

	public void setIdAdmin(int idAdmin) {
		this.idAdmin = idAdmin;
	}
	
}
