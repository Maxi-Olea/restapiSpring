package com.mobydigital.apirest.entity;

import javax.persistence.*;

@Entity
@Table(name="candidato_has_tecnologia")
public class CandidatoHasTecnologia {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idrelacion")
	private int idRelacion;
	
	@Column(name="CANDIDATO_idcandidato")
	private int idCandidato;
	
	@Column(name="TECNOLOGIA_idtecnologia")
	private int idTecnologia;
	
	@Column(name="experiencia")
	private int experiencia;
	
	//Getters and Setters
	
	public int getIdRelacion() {
		return idRelacion;
	}

	public void setIdRelacion(int idRelacion) {
		this.idRelacion = idRelacion;
	}
	
	public int getIdCandidato() {
		return idCandidato;
	}

	public void setIdCandidato(int idCandidato) {
		this.idCandidato = idCandidato;
	}

	public int getIdTecnologia() {
		return idTecnologia;
	}

	public void setIdTecnologia(int idTecnologia) {
		this.idTecnologia = idTecnologia;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	
		
}
