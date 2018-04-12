package com.agenda.grupocuatro.model;

import java.sql.Date;
import java.util.Collection;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="personas")
public class Personas {

	@Id
	@GeneratedValue
	private int idpersonas;
	
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String dni;
	private Date fechaNacimiento;
	
	@OneToOne
	@JoinColumn(name="idEmpleado", referencedColumnName="idempleados")
	private Empleado empleado;
	
	@OneToMany(mappedBy = "persona")
    private Collection<Telefonos> telefonosCollection;
	
	@OneToMany(mappedBy = "persona")
    private Collection<Direcciones> direccionesCollection;
	
	
	public Personas(){
		
	}


	public Personas(int idpersonas, String nombre, String apellido1, String apellido2, String dni, Date fechaNacimiento,
			Empleado empleado) {
		super();
		this.idpersonas = idpersonas;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.empleado = empleado;
	}


	public Personas(int idpersonas, String nombre, String apellido1, String apellido2, String dni, Date fechaNacimiento,
			Empleado empleado, Collection<Telefonos> telefonosCollection,
			Collection<Direcciones> direccionesCollection) {
		super();
		this.idpersonas = idpersonas;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.empleado = empleado;
		this.telefonosCollection = telefonosCollection;
		this.direccionesCollection = direccionesCollection;
	}


	public int getIdpersonas() {
		return idpersonas;
	}


	public void setIdpersonas(int idpersonas) {
		this.idpersonas = idpersonas;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido1() {
		return apellido1;
	}


	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}


	public String getApellido2() {
		return apellido2;
	}


	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public Empleado getEmpleado() {
		return empleado;
	}


	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}


	public Collection<Telefonos> getTelefonosCollection() {
		return telefonosCollection;
	}


	public void setTelefonosCollection(Collection<Telefonos> telefonosCollection) {
		this.telefonosCollection = telefonosCollection;
	}


	public Collection<Direcciones> getDireccionesCollection() {
		return direccionesCollection;
	}


	public void setDireccionesCollection(Collection<Direcciones> direccionesCollection) {
		this.direccionesCollection = direccionesCollection;
	}
	
	
	
	
}
