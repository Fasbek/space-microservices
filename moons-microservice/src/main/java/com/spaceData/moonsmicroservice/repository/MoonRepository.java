package com.spaceData.moonsmicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spaceData.moonsmicroservice.models.BeanMoon;

@Repository
public interface MoonRepository extends JpaRepository<BeanMoon, String>{

}
