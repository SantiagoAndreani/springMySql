package com.practica.clase.api.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.practica.clase.api.beans.domain.PracticaModel;
import com.practica.clase.api.beans.entity.PracticaEntity;
import com.practica.clase.api.repository.iPracticaRepository;

@Controller
@RequestMapping("practica")
public class PracticaController {

	@Autowired
	private iPracticaRepository practicaRepository;
	
	@PostMapping(path = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String addNewUser (@RequestBody @Validated PracticaModel practica) {
		
		PracticaEntity p = new PracticaEntity();
			
		BeanUtils.copyProperties(practica, p);
		this.practicaRepository.save(p);
		
		return "Saved";
	}
	
	@GetMapping(path = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Iterable<PracticaEntity> getAllUsers(){
		
		return practicaRepository.findAll();
	}
	
	@PutMapping(path = "/update")
	public @ResponseBody String updateUser (@RequestBody @Validated PracticaModel practica) {
		
		PracticaEntity p = new PracticaEntity();
		
		BeanUtils.copyProperties(practica, p);
		this.practicaRepository.save(p);
		
		return "Updated";
	}
	
	@DeleteMapping(path = "/delete", consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String deleteUser (@RequestBody PracticaModel practica){
				
		PracticaEntity p = new PracticaEntity();
		BeanUtils.copyProperties(practica, p);
		practicaRepository.deleteById(p.getId());
				
		return "Deleted";
	}
}
