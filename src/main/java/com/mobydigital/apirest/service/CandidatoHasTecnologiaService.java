package com.mobydigital.apirest.service;

import java.util.List;

import com.mobydigital.apirest.entity.CandidatoHasTecnologia;


public interface CandidatoHasTecnologiaService {
	
	public List<CandidatoHasTecnologia> findAll();
	
	public CandidatoHasTecnologia findById(int idRelacion);
	
	public void save(CandidatoHasTecnologia candidatoTecnologia);
	
	public void deleteById(int idrelacion);

}
