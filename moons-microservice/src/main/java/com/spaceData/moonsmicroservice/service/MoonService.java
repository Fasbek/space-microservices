package com.spaceData.moonsmicroservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.spaceData.moonsmicroservice.models.BeanMoon;
import com.spaceData.moonsmicroservice.models.dto.DtoMoon;
import com.spaceData.moonsmicroservice.repository.MoonRepository;

@Service
public class MoonService {

	@Autowired
	private MoonRepository moonRepository;
	
	public List<DtoMoon> getAll(){
		List<BeanMoon> list = moonRepository.findAll();
		List<DtoMoon> listdto = new ArrayList<DtoMoon>();
		for(BeanMoon bean: list) {
			DtoMoon dto = bean.obtenerDto();
			listdto.add(dto);
		};
		return listdto;
	}
	
	public DtoMoon getMoonById(String id){
		BeanMoon luna = moonRepository.findById(id).orElse(null);
		DtoMoon dto = luna.obtenerDto();
		return dto;
	}
	
	public DtoMoon guardarDto(DtoMoon dto) {
		BeanMoon beanMoon = dto.obtenerBean();
		guardarDto(beanMoon);
		return dto;
	}
	
	public BeanMoon guardarDto(BeanMoon dto) {
		BeanMoon nuevaLuna = moonRepository.save(dto);
		return nuevaLuna;
	}
}
