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

import com.mobydigital.apirest.entity.Tecnologia;
import com.mobydigital.apirest.service.TecnologiaService;

@RestController
@RequestMapping("/api")
public class TecnologiaRestController {
	
	@Autowired
	private TecnologiaService tecnologiaService;
	
	@GetMapping("/tecnologias")
	public List<Tecnologia> findAll() {
		return tecnologiaService.findAll();
	}
	
	@GetMapping("/tecnologias/{id}")
	public Tecnologia getTecnologia(@PathVariable int id) {
		Tecnologia tecnologia = tecnologiaService.findById(id);
		
		if(tecnologia == null) {
			throw new RuntimeException("La tecnologia con el id: " + id + " no fue encontrada");
		}
		return tecnologia;
	}
	
	@PostMapping("/tecnologias")
	public Tecnologia addTecnologia(@RequestBody Tecnologia tecnologia) {
		tecnologia.setId(0);
		
		tecnologiaService.save(tecnologia);
		
		return tecnologia;
	}
	
	@PutMapping("/tecnologias")
	public Tecnologia updateTecnologia(@RequestBody Tecnologia tecnologia) {
		tecnologiaService.save(tecnologia);
		return tecnologia;
	}
	
	@DeleteMapping("tecnologias/{id}")
	public String deleteTecnologia(@PathVariable int id) {
		Tecnologia tecnologia = tecnologiaService.findById(id);
		
		if(tecnologia == null) {
			throw new RuntimeException("La tecnologia con el id: " + id + " no fue encontrada");
		}
		
		tecnologiaService.deleteById(id);
		
		return "Tecnologia eliminada";
	}

}
