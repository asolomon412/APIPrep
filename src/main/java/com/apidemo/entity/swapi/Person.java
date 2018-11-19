package com.apidemo.entity.swapi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Person {

	private String name;
	private String height;
	private String mass;
	// @JsonProperty("hair_color")
	private String hair_color;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getMass() {
		return mass;
	}

	public void setMass(String mass) {
		this.mass = mass;
	}

	public String getHair_color() {
		return hair_color;
	}

	public void setHair_color(String hair_color) {
		this.hair_color = hair_color;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", height=" + height + ", mass=" + mass + ", hair_color=" + hair_color + "]";
	}

	
}
