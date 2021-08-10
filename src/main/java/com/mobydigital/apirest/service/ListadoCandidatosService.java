package com.mobydigital.apirest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mobydigital.apirest.entity.ListadoCandidatos;

@Service
public interface ListadoCandidatosService {
	
	public List<ListadoCandidatos> findAll();
	
	public List<ListadoCandidatos> findByTecnologia(String tecnologia);

}
