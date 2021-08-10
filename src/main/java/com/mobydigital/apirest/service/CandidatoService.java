package com.mobydigital.apirest.service;

import java.util.List;

import com.mobydigital.apirest.entity.Candidato;

public interface CandidatoService {
	
	public List<Candidato> findAll();
	
	public Candidato findById(int id);
	
	public void save(Candidato persona);
	
	public void deleteById(int id);

}
