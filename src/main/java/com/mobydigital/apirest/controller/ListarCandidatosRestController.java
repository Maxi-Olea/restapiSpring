package com.mobydigital.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobydigital.apirest.dao.ListadoCandidatosDAO;
import com.mobydigital.apirest.entity.ListadoCandidatos;

@RestController
@RequestMapping("/api")
public class ListarCandidatosRestController {
	
	@Autowired
	private ListadoCandidatosDAO listadoCandidatosDAO;

	@GetMapping("/listar")
	public List<ListadoCandidatos> findAll() {
		return listadoCandidatosDAO.findAll();
	}
	
	@GetMapping("listar/{tecnologia}")
	public List<ListadoCandidatos> findByTecnologia(@PathVariable String tecnologia) {
		return listadoCandidatosDAO.findByTecnologia(tecnologia);
	}
}
