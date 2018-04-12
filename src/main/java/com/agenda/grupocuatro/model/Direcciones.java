package com.agenda.grupocuatro.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.agenda.grupocuatro.model.Personas;

@Entity
@Table(name = "direcciones")
public class Direcciones {

	@Id
	@GeneratedValue
	private int iddirecciones;
	
	private String direccion;
	private String codPostal;
	private String localidad;
	private String provincia;
	
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn (name="idPersona")
	private Personas persona;
	
	
	public Direcciones () {
		
	}


	public Direcciones(int iddirecciones, String direccion, String codPostal, String localidad, String provincia,
			Personas persona) {
		super();
		this.iddirecciones = iddirecciones;
		this.direccion = direccion;
		this.codPostal = codPostal;
		this.localidad = localidad;
		this.provincia = provincia;
		this.persona = persona;
	}


	public int getIddirecciones() {
		return iddirecciones;
	}


	public void setIddirecciones(int iddirecciones) {
		this.iddirecciones = iddirecciones;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getCodPostal() {
		return codPostal;
	}


	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}


	public String getLocalidad() {
		return localidad;
	}


	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}


	public String getProvincia() {
		return provincia;
	}


	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}


	public Personas getPersona() {
		return persona;
	}


	public void setPersona(Personas persona) {
		this.persona = persona;
	}
	

	
}
