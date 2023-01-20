package com.spaceData.moonsmicroservice.models;

import java.math.BigDecimal;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.spaceData.moonsmicroservice.models.dto.DtoMoon;

@Entity
@Table(name="moons")
public class BeanMoon implements java.io.Serializable{

	@EmbeddedId
	private BeanMoonPk pk;
	
//	private String moon_id;
//	private String name;
	private String isplanet;
	private Integer semimayoraxis;
	private Integer perihelion;
	private Integer aphelion;
	private BigDecimal eccentricity;
	private BigDecimal inclination;
	private BigDecimal massvalue;
	private Integer massexponent;
	private BigDecimal volvalue;
	private Integer volexponent;
	private BigDecimal density;
	private BigDecimal gravity;
	private BigDecimal escapevel;
	private BigDecimal meanradius;
	private BigDecimal equaradius;
	private BigDecimal polarradius;
	private BigDecimal flattening;
	private BigDecimal sideralorbit;
	private BigDecimal sideralrotation;
	private Integer avgtemp;
	private String bodytype;
	
	public BeanMoon() {
		pk = new BeanMoonPk();
	}
	
	public BeanMoon(BeanMoonPk pk) {
		this.pk = pk;
	}
	
	
	public BeanMoonPk getPk() {
		return pk;
	}

	public void setPk(BeanMoonPk pk) {
		this.pk = pk;
	}

	//	public String getMoon_id() {
//		return moon_id;
//	}
//	public void setMoon_id(String moon_id) {
//		this.moon_id = moon_id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
	public String getIsplanet() {
		return isplanet;
	}
	public void setIsplanet(String isplanet) {
		this.isplanet = isplanet;
	}
	public Integer getSemimayoraxis() {
		return semimayoraxis;
	}
	public void setSemimayoraxis(Integer semimayoraxis) {
		this.semimayoraxis = semimayoraxis;
	}
	public Integer getPerihelion() {
		return perihelion;
	}
	public void setPerihelion(Integer perihelion) {
		this.perihelion = perihelion;
	}
	public Integer getAphelion() {
		return aphelion;
	}
	public void setAphelion(Integer aphelion) {
		this.aphelion = aphelion;
	}
	public BigDecimal getEccentricity() {
		return eccentricity;
	}
	public void setEccentricity(BigDecimal eccentricity) {
		this.eccentricity = eccentricity;
	}
	public BigDecimal getInclination() {
		return inclination;
	}
	public void setInclination(BigDecimal inclination) {
		this.inclination = inclination;
	}
	public BigDecimal getMassvalue() {
		return massvalue;
	}
	public void setMassvalue(BigDecimal massvalue) {
		this.massvalue = massvalue;
	}
	public Integer getMassexponent() {
		return massexponent;
	}
	public void setMassexponent(Integer massexponent) {
		this.massexponent = massexponent;
	}
	public BigDecimal getVolvalue() {
		return volvalue;
	}
	public void setVolvalue(BigDecimal volvalue) {
		this.volvalue = volvalue;
	}
	public Integer getVolexponent() {
		return volexponent;
	}
	public void setVolexponent(Integer volexponent) {
		this.volexponent = volexponent;
	}
	public BigDecimal getDensity() {
		return density;
	}
	public void setDensity(BigDecimal density) {
		this.density = density;
	}
	public BigDecimal getGravity() {
		return gravity;
	}
	public void setGravity(BigDecimal gravity) {
		this.gravity = gravity;
	}
	public BigDecimal getEscapevel() {
		return escapevel;
	}
	public void setEscapevel(BigDecimal escapevel) {
		this.escapevel = escapevel;
	}
	public BigDecimal getMeanradius() {
		return meanradius;
	}
	public void setMeanradius(BigDecimal meanradius) {
		this.meanradius = meanradius;
	}
	public BigDecimal getEquaradius() {
		return equaradius;
	}
	public void setEquaradius(BigDecimal equaradius) {
		this.equaradius = equaradius;
	}
	public BigDecimal getPolarradius() {
		return polarradius;
	}
	public void setPolarradius(BigDecimal polarradius) {
		this.polarradius = polarradius;
	}
	public BigDecimal getFlattening() {
		return flattening;
	}
	public void setFlattening(BigDecimal flattening) {
		this.flattening = flattening;
	}
	public BigDecimal getSideralorbit() {
		return sideralorbit;
	}
	public void setSideralorbit(BigDecimal sideralorbit) {
		this.sideralorbit = sideralorbit;
	}
	public BigDecimal getSideralrotation() {
		return sideralrotation;
	}
	public void setSideralrotation(BigDecimal sideralrotation) {
		this.sideralrotation = sideralrotation;
	}
	public Integer getAvgtemp() {
		return avgtemp;
	}
	public void setAvgtemp(Integer avgtemp) {
		this.avgtemp = avgtemp;
	}
	public String getBodytype() {
		return bodytype;
	}
	public void setBodytype(String bodytype) {
		this.bodytype = bodytype;
	}
	
	public DtoMoon	obtenerDto(DtoMoon dto) {
		
		dto.setMoon_id(pk.getMoon_id());
		dto.setName(pk.getName());
		dto.setIsplanet(isplanet);
		dto.setSemimayoraxis(semimayoraxis);
		dto.setPerihelion(perihelion);
		dto.setAphelion(aphelion);
		dto.setEccentricity(eccentricity);
		dto.setInclination(inclination);
		dto.setMassvalue(massvalue);
		dto.setMassexponent(massexponent);
		dto.setVolvalue(volvalue);
		dto.setVolexponent(volexponent);
		dto.setDensity(density);
		dto.setGravity(gravity);
		dto.setEscapevel(escapevel);
		dto.setMeanradius(meanradius);
		dto.setEquaradius(equaradius);
		dto.setPolarradius(polarradius);
		dto.setFlattening(flattening);
		dto.setSideralorbit(sideralorbit);
		dto.setSideralrotation(sideralrotation);
		dto.setAvgtemp(avgtemp);
		dto.setBodytype(bodytype);
		return dto;
	}
	
	public DtoMoon obtenerDto() {
		DtoMoon dto = new DtoMoon();
		return obtenerDto(dto);
	}
	
}
