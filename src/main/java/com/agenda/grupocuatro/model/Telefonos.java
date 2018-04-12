package com.agenda.grupocuatro.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.agenda.grupocuatro.model.Personas;

@Entity
@Table(name="telefonos")
public class Telefonos {

	@Id
	@GeneratedValue
	private int idtelefonos;
	
	private String telefono;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="idPersona")
	private Personas persona;

	
	
	public Telefonos(){
		
	}
	
	
	public Telefonos(int idtelefonos, String telefono, Personas persona) {
		super();
		this.idtelefonos = idtelefonos;
		this.telefono = telefono;
		this.persona = persona;
	}


	public int getIdtelefonos() {
		return idtelefonos;
	}


	public void setIdtelefonos(int idtelefonos) {
		this.idtelefonos = idtelefonos;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public Personas getPersona() {
		return persona;
	}


	public void setPersona(Personas persona) {
		this.persona = persona;
	}
	
	
	
	
}
