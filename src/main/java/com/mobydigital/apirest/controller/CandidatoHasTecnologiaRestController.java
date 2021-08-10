package com.mobydigital.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mobydigital.apirest.entity.CandidatoHasTecnologia;
import com.mobydigital.apirest.service.CandidatoHasTecnologiaService;


@RestController
@RequestMapping("/api")
public class CandidatoHasTecnologiaRestController {
	
	@Autowired
	private CandidatoHasTecnologiaService candidatoHasTecnologiaService;
	
	@GetMapping("/relacion")
	public List<CandidatoHasTecnologia> findAll() {
		return candidatoHasTecnologiaService.findAll();
	}
	
	@PostMapping("/relacion")
	public CandidatoHasTecnologia addRelacion(@RequestBody CandidatoHasTecnologia relacion) {
		relacion.setIdRelacion(0);
		
		candidatoHasTecnologiaService.save(relacion);
		
		return relacion;
	}
	
	@PutMapping("/relacion")
	public CandidatoHasTecnologia updateRelacion(@RequestBody CandidatoHasTecnologia candidatoTecnologia) {
		candidatoHasTecnologiaService.save(candidatoTecnologia);
		return candidatoTecnologia;
	}
	
	@DeleteMapping("relacion/{id}")
	public String deleteRelacion(@PathVariable int id) {
		CandidatoHasTecnologia relacion = candidatoHasTecnologiaService.findById(id);
		
		if(relacion == null) {
			throw new RuntimeException("La relacion entre el candidato y tecnologia con id: " + id + " no fue encontrada");
		}
		
		candidatoHasTecnologiaService.deleteById(id);
		
		return "Relacion eliminada";
	}

}
