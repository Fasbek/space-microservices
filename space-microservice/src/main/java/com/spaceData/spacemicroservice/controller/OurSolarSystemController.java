package com.spaceData.spacemicroservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spaceData.spacemicroservice.models.OurSolarSystemPlanet;
import com.spaceData.spacemicroservice.service.OurSolarSystemService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/oursolarsystem")
public class OurSolarSystemController {

	@Autowired
	private OurSolarSystemService ourSolarSystemService;
	
	@GetMapping("/listarplanetas")
	public ResponseEntity<List<OurSolarSystemPlanet>> listarPlanetas(){
		List<OurSolarSystemPlanet> planetas = ourSolarSystemService.getAll();
		if(planetas.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(planetas);
	}
	
	@CircuitBreaker(name="moonsCB", fallbackMethod="fallBackGetMoons")
	@GetMapping("/obtenerdto/{id}")
	public ResponseEntity<OurSolarSystemPlanet> obtenerDto(@PathVariable("id") String id){
		OurSolarSystemPlanet planeta = ourSolarSystemService.getPlanetById(id);
		if(planeta == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(planeta);
	}
	
	@PostMapping("/guardardto")
	public ResponseEntity<OurSolarSystemPlanet> guardarDto(@RequestBody OurSolarSystemPlanet dto){
		OurSolarSystemPlanet nuevoPlaneta = ourSolarSystemService.guardarDto(dto);
		return ResponseEntity.ok(nuevoPlaneta);
	}
	
	private ResponseEntity<OurSolarSystemPlanet> fallBackGetMoons(@PathVariable("id") String id, RuntimeException e){
		return new ResponseEntity("El planeta no tiene lunas registradas.", HttpStatus.OK);
	}
}
