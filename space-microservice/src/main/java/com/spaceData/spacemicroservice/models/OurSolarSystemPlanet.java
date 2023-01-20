package com.spaceData.spacemicroservice.models;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//@Table(name="OurSolarSystemPlanet")
@Entity
@Table(name="oursolarsystemplanet", catalog="oursolarsystemdb", schema="DBO")
public class OurSolarSystemPlanet {

	@Id
	private String name;
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Integer planet_id;

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

	public OurSolarSystemPlanet() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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

}
