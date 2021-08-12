package com.mobydigital.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mobydigital.apirest.entity.Candidato;
import com.mobydigital.apirest.exceptionHandler.NotFoundException;
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
			throw new NotFoundException(("id: " + id));
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
			throw new NotFoundException(("id: " + id));
		}
		
		candidatoService.deleteById(id);
		
		return "Candidato eliminado";
	}

}
