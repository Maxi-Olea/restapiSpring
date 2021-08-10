package com.mobydigital.apirest.entity;

import javax.persistence.*;

@Entity
@Table(name="tecnologia")
public class Tecnologia {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idtecnologia")
	private int id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="version")
	private String version;
	
	// Getters and Setters

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

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
	// Metodo to String

	@Override
	public String toString() {
	
		return "La tecnologia con id = " + id + " es " + nombre + " y la version es = " + version;
	}
	
	
	
	

}
