package com.mobydigital.apirest.dao;

import java.util.List;

import com.mobydigital.apirest.entity.*;

public interface CandidatoDAO {
	
	public List<Candidato> findAll();
	
	public Candidato findById(int id);
	
	public void save(Candidato persona);
	
	public void deleteById(int id);

}
