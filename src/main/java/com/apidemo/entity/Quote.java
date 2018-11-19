package com.apidemo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

	// if your variable names don't match the key names
	// @JsonProperty("name")
	private String type;
	private Value value;

	public Quote() {
		
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Value getValue() {
		return value;
	}

	public void setValue(Value value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Quote [type=" + type + ", value=" + value + "]";
	}

}
