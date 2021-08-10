package com.mobydigital.apirest.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="candidato")
public class Candidato {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idcandidato")
	private int id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellido")
	private String apellido;
	
	@Column(name="tipodoc")
	private String tipoDoc;
	
	@Column(name="numdoc")
	private String numDoc;
	
	@Column(name="fechanac")
	private Date fechaNac;

	
//	Getters and Setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTipoDoc() {
		return tipoDoc;
	}

	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}

	public String getNumDoc() {
		return numDoc;
	}

	public void setNumDoc(String numDoc) {
		this.numDoc = numDoc;
	}

	public Date getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}
	
	// Metodo to string

	@Override
	public String toString() {
		return "Candidato [id= " + id + ", Nombre Completo = " + nombre + " " + apellido 
				+ ", tipo de documento = " + tipoDoc + " numero = " 
				+ numDoc + ", Fecha de nacimiento = " + fechaNac;
	}
	
	
	
	
	
}
