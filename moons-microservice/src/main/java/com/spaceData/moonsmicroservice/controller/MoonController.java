package com.spaceData.moonsmicroservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spaceData.moonsmicroservice.models.dto.DtoMoon;
import com.spaceData.moonsmicroservice.service.MoonService;

@RestController
@RequestMapping("/moons")
public class MoonController {

	@Autowired
	private MoonService moonService;
	
	@GetMapping("/listarlunas")
	public ResponseEntity<List<DtoMoon>> listarLunas(){
		List<DtoMoon> moons = moonService.getAll();
		if(moons.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(moons);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<DtoMoon> obtenerDto(@PathVariable String id){
		DtoMoon moon = moonService.getMoonById(id);
		if(moon == null) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(moon);
	}
	
	@PutMapping("/guardardto")
	public ResponseEntity<DtoMoon> guardarDto(@RequestBody DtoMoon dto){
		DtoMoon nuevaLuna = moonService.guardarDto(dto);
		return ResponseEntity.ok(nuevaLuna);
	}
	
}
