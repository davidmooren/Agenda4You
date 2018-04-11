package com.agenda.grupocuatro.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "empleados")
public class Empleado {
	

	@Id
	@GeneratedValue
	private int idempleados;

	private String codEmpleado;
	private String salario;
	private Date fechaAlta;
	
@OneToOne
//@JoinColumn(name="idDepartamento", referencedColumnName="iddepartamento")
	private Departamento departamento;
	
@OneToOne
//@JoinColumn(name="idCategoria", referencedColumnName="idcategorias")
	private Categorias categorias;
	
	
	
	public Empleado() {

	}



	public Empleado(int idempleado, String codEmpleado, String salario, Date fechaAlta, Departamento idDepartamento,
			Categorias idCategoria) {
		super();
		this.idempleados = idempleado;
		this.codEmpleado = codEmpleado;
		this.salario = salario;
		this.fechaAlta = fechaAlta;
		this.departamento = idDepartamento;
		this.categorias = idCategoria;
	}



	public int getIdempleados() {
		return idempleados;
	}



	public void setIdempleados(int idempleado) {
		this.idempleados = idempleado;
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



	public Departamento getDepartamento() {
		return departamento;
	}



	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}



	public Categorias getCategorias() {
		return categorias;
	}



	public void setCategorias(Categorias categoria) {
		this.categorias = categoria;
	}

	
	

}
