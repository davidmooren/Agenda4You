package com.agenda.grupocuatro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "departamentos")
public class Departamento {

	@Id
	@GeneratedValue
	private int iddepartamento;

	private String nombre;

	public Departamento() {

	}

	public Departamento(int iddepartamento, String nombre) {
		super();
		this.iddepartamento = iddepartamento;
		this.nombre = nombre;
	}

	public int getIddepartamento() {
		return iddepartamento;
	}

	public void setIddepartamento(int iddepartamento) {
		this.iddepartamento = iddepartamento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
