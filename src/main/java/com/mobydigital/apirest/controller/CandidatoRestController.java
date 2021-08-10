package com.mobydigital.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobydigital.apirest.entity.Candidato;
import com.mobydigital.apirest.service.CandidatoService;

@RestController
@RequestMapping("/api")
public class CandidatoRestController {
	
	@Autowired
	private CandidatoService candidatoService;
	
	@GetMapping("/candidatos")
	public List<Candidato> findAll() {
		return candidatoService.findAll();
	}
	
	@GetMapping("/candidatos/{id}")
	public Candidato getCandidato(@PathVariable int id) {
		Candidato persona = candidatoService.findById(id);
		
		if(persona == null) {
			throw new RuntimeException("El candidato con el id: " + id + " no fue encontrado");
		}
		return persona;
	}
	
	@PostMapping("/candidatos")
	public Candidato addCandidato(@RequestBody Candidato persona) {
		persona.setId(0);
		
		candidatoService.save(persona);
		
		return persona;
	}
	
	@PutMapping("/candidatos")
	public Candidato updateCandidato(@RequestBody Candidato persona) {
		candidatoService.save(persona);
		return persona;
	}
	
	@DeleteMapping("candidatos/{id}")
	public String deleteCandidato(@PathVariable int id) {
		Candidato persona = candidatoService.findById(id);
		
		if(persona == null) {
			throw new RuntimeException("El candidato con el id: " + id + " no fue encontrado");
		}
		
		candidatoService.deleteById(id);
		
		return "Candidato eliminado";
	}

}
