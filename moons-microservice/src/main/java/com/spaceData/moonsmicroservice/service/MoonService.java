package com.spaceData.moonsmicroservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.spaceData.moonsmicroservice.models.BeanMoon;
import com.spaceData.moonsmicroservice.models.BeanMoonPk;
import com.spaceData.moonsmicroservice.models.dto.DtoMoon;
import com.spaceData.moonsmicroservice.repository.MoonRepository;

@Service
public class MoonService {

	@Autowired
	private MoonRepository moonRepository;
	
	public List<DtoMoon> getAll(){
		List<BeanMoon> listabean = moonRepository.findAll();
		List<DtoMoon> listadto = new ArrayList<DtoMoon>();
		for(BeanMoon bean: listabean) {
			DtoMoon dto = bean.obtenerDto();
			listadto.add(dto);
		};
		return listadto;
	}
	
	public DtoMoon getMoonById(String id,String name){
		BeanMoonPk bean = new BeanMoonPk(id, name);
//		bean.getPk().setMoon_id(id);
//		bean.getPk().setName(name);
		BeanMoon luna = moonRepository.findByPk(bean);
		DtoMoon dto = luna.obtenerDto();
		return dto;
	}
	
	public List<DtoMoon> getMoonById(String id){

		List<BeanMoon> lunas = moonRepository.findByIdsIn(id);
		List<DtoMoon> listadto = new ArrayList<>();
		
		if(!lunas.isEmpty()) {
			for(BeanMoon bean: lunas) {
				DtoMoon dto = bean.obtenerDto();
				listadto.add(dto);
			}
		}
		return listadto;
	}
//	
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
