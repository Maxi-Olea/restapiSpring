package com.mobydigital.apirest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobydigital.apirest.dao.TecnologiaDAO;
import com.mobydigital.apirest.entity.Tecnologia;

@Service
public class TecnologiaServiceImpl implements TecnologiaService {
	
	@Autowired
	private TecnologiaDAO tecnologiaDAO;
	
	@Override
	public List<Tecnologia> findAll() {
		List<Tecnologia> listTecnologia = tecnologiaDAO.findAll();
		return listTecnologia;
	}
	
	@Override
	public Tecnologia findById(int id) {
		Tecnologia tecnologia = tecnologiaDAO.findById(id);
		return tecnologia;
	}

	@Override
	public void save(Tecnologia tecnologia) {
		tecnologiaDAO.save(tecnologia);
		
	}

	@Override
	public void deleteById(int id) {
		tecnologiaDAO.deleteById(id);
		
	}
	
	

}
