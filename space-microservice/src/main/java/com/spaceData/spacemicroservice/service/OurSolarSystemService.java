package com.spaceData.spacemicroservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spaceData.spacemicroservice.repository.OurSolarSystemRepository;
import com.spaceData.spacemicroservice.models.OurSolarSystemPlanet;

@Service
public class OurSolarSystemService {
	
	@Autowired
	private OurSolarSystemRepository ourSolarSystemRepository; 
	
	public List<OurSolarSystemPlanet> getAll(){
		return ourSolarSystemRepository.findAll();
	}
	
	public OurSolarSystemPlanet getPlanetById(String id) {
		return ourSolarSystemRepository.findById(id).orElse(null);
	}
	
	public OurSolarSystemPlanet guardarDto(OurSolarSystemPlanet dto) {
		OurSolarSystemPlanet nuevoPlaneta = ourSolarSystemRepository.save(dto);
		return nuevoPlaneta;
	}
	
}
