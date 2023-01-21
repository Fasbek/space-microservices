package com.spaceData.moonsmicroservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.spaceData.moonsmicroservice.models.BeanMoon;
import com.spaceData.moonsmicroservice.models.BeanMoonPk;

@Repository
public interface MoonRepository extends JpaRepository<BeanMoon, String>{
	BeanMoon findByPk(BeanMoonPk bean);
	@Query(value="SELECT * FROM Moons t WHERE t.moon_id=:id", nativeQuery=true)
	List<BeanMoon> findByIdsIn(String id);
}

