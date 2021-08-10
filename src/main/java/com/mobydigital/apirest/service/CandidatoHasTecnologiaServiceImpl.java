package com.mobydigital.apirest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobydigital.apirest.dao.CandidatoHasTecnologiaDAO;
import com.mobydigital.apirest.entity.CandidatoHasTecnologia;

@Service
public class CandidatoHasTecnologiaServiceImpl implements CandidatoHasTecnologiaService {
	
	@Autowired
	private CandidatoHasTecnologiaDAO candidatoHasTecnologiaDAO;

	@Override
	public List<CandidatoHasTecnologia> findAll() {
		List<CandidatoHasTecnologia> listCandidatosTecnologia = candidatoHasTecnologiaDAO.findAll();
		return listCandidatosTecnologia;
	}

	@Override
	public void save(CandidatoHasTecnologia candidatoTecnologia) {
		candidatoHasTecnologiaDAO.save(candidatoTecnologia);
		
	}

	@Override
	public void deleteById(int idRelacion) {
		candidatoHasTecnologiaDAO.deleteById(idRelacion);;
		
	}

	@Override
	public CandidatoHasTecnologia findById(int idRelacion) {
		CandidatoHasTecnologia relacion = candidatoHasTecnologiaDAO.findById(idRelacion);
		return relacion;
	}

}
