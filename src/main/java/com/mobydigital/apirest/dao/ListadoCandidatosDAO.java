package com.mobydigital.apirest.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mobydigital.apirest.entity.ListadoCandidatos;

@Repository
public interface ListadoCandidatosDAO extends JpaRepository<ListadoCandidatos, Long> {
	
	public List<ListadoCandidatos> findAll();
	
	public List<ListadoCandidatos> findByTecnologia(String tecnologia);

}
