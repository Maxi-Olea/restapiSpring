package com.mobydigital.apirest.dao;

import java.util.List;

import com.mobydigital.apirest.entity.Tecnologia;

public interface TecnologiaDAO {
	
	public List<Tecnologia> findAll();
	
	public Tecnologia findById(int id);
	
	public void save(Tecnologia tecnologia);
	
	public void deleteById(int id);

}
