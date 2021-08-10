package com.mobydigital.apirest.dao;

import java.util.List;

import com.mobydigital.apirest.entity.CandidatoHasTecnologia;

public interface CandidatoHasTecnologiaDAO {

	public List<CandidatoHasTecnologia> findAll();
	
	public CandidatoHasTecnologia findById(int idRelacion);
	
	public void save(CandidatoHasTecnologia candidatoTecnologia);
	
	public void deleteById(int idRelacion);
}
