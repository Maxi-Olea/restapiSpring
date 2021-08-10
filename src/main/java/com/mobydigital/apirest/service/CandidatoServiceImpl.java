package com.mobydigital.apirest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobydigital.apirest.dao.CandidatoDAO;
import com.mobydigital.apirest.entity.Candidato;


@Service
public class CandidatoServiceImpl implements CandidatoService {
	
	@Autowired
	private CandidatoDAO candidatoDAO;

	@Override
	public List<Candidato> findAll() {
		List<Candidato> listCandidatos = candidatoDAO.findAll();
		return listCandidatos;
	}

	@Override
	public Candidato findById(int id) {
		Candidato persona = candidatoDAO.findById(id);
		return persona;
	}

	@Override
	public void save(Candidato persona) {
		candidatoDAO.save(persona);
		
	}

	@Override
	public void deleteById(int id) {
		candidatoDAO.deleteById(id);
		
	}

}
