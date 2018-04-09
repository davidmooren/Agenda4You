package com.agenda.grupocuatro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="categorias")
public class Categorias {

	@Id
	@GeneratedValue
	@Column(name="idcategorias")
	private int idCategorias;
	private String nombre;
	private String descripcion;
	
	public Categorias(){
		
	}

	public Categorias(int idCategorias, String nombre, String descripcion) {
		this.idCategorias = idCategorias;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public int getIdCategorias() {
		return idCategorias;
	}

	public void setIdCategorias(int idCategorias) {
		this.idCategorias = idCategorias;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
