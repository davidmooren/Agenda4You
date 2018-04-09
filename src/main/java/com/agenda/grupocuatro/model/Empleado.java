package com.agenda.grupocuatro.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "empleados")
public class Empleado {
	

	@Id
	@GeneratedValue
	private int idempleado;

	private String codEmpleado;
	private String salario;
	private Date fechaAlta;
	
@OneToOne
@JoinColumn(name="idDepartamento", referencedColumnName="iddepartamento")
	private Departamento idDepartamento;
	
@OneToOne
@JoinColumn(name="idCategoria", referencedColumnName="idcategorias")
	private Categorias idCategoria;
	
	
	
	public Empleado() {

	}



	public Empleado(int idempleado, String codEmpleado, String salario, Date fechaAlta, Departamento idDepartamento,
			Categorias idCategoria) {
		super();
		this.idempleado = idempleado;
		this.codEmpleado = codEmpleado;
		this.salario = salario;
		this.fechaAlta = fechaAlta;
		this.idDepartamento = idDepartamento;
		this.idCategoria = idCategoria;
	}



	public int getIdempleado() {
		return idempleado;
	}



	public void setIdempleado(int idempleado) {
		this.idempleado = idempleado;
	}



	public String getCodEmpleado() {
		return codEmpleado;
	}



	public void setCodEmpleado(String codEmpleado) {
		this.codEmpleado = codEmpleado;
	}



	public String getSalario() {
		return salario;
	}



	public void setSalario(String salario) {
		this.salario = salario;
	}



	public Date getFechaAlta() {
		return fechaAlta;
	}



	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}



	public Departamento getIdDepartamento() {
		return idDepartamento;
	}



	public void setIdDepartamento(Departamento idDepartamento) {
		this.idDepartamento = idDepartamento;
	}



	public Categorias getIdCategoria() {
		return idCategoria;
	}



	public void setIdCategoria(Categorias idCategoria) {
		this.idCategoria = idCategoria;
	}

	
	

}
