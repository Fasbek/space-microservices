package com.spaceData.spacemicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spaceData.spacemicroservice.models.OurSolarSystemPlanet;

@Repository
public interface OurSolarSystemRepository extends JpaRepository<OurSolarSystemPlanet, String>{
	
}
