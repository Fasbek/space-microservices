package com.spaceData.moonsmicroservice.models;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class BeanMoonPk implements java.io.Serializable{
	
	@Size(min = 0, max = 15)
	@NotNull
	@NotEmpty
	@Column(name="moon_id")
	private String moon_id;

	@Size(min = 0, max = 15)
	@NotNull
	@Column(name="name")
	private String name;

	public BeanMoonPk() {
	}

	public BeanMoonPk(@Size(min = 0, max = 15) @NotNull @NotEmpty String moon_id,
			@Size(min = 0, max = 15) @NotNull String name) {
		super();
		this.moon_id = moon_id;
		this.name = name;
	}

	public String getMoon_id() {
		return moon_id;
	}

	public void setMoon_id(String moon_id) {
		this.moon_id = moon_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
