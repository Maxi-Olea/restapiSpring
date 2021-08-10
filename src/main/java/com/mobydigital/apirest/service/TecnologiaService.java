package com.mobydigital.apirest.service;

import java.util.List;

import com.mobydigital.apirest.entity.Tecnologia;

public interface TecnologiaService {
	
	public List<Tecnologia> findAll();
	
	public Tecnologia findById(int id);
	
	public void save(Tecnologia tecnologia);
	
	public void deleteById(int id);

}
