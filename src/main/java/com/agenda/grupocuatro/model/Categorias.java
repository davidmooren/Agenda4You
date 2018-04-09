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
	private int idcategorias;
	private String nombre;
	private String descripcion;
	
	public Categorias(){
		
	}

	public Categorias(int idCategorias, String nombre, String descripcion) {
		this.idcategorias = idCategorias;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public int getIdCategorias() {
		return idcategorias;
	}

	public void setIdCategorias(int idCategorias) {
		this.idcategorias = idCategorias;
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
