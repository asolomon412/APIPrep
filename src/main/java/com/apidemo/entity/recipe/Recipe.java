package com.apidemo.entity.recipe;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Recipe {

	private String yield;
	private String label;
	private String url;
	private String image;
	@JsonProperty("dietLabels")
	private ArrayList<String> dietLabels;
	
	public Recipe() {
		
	}

	public String getYield() {
		return yield;
	}

	public void setYield(String yield) {
		this.yield = yield;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public ArrayList<String> getDietLabels() {
		return dietLabels;
	}

	public void setDietLabels(ArrayList<String> dietLabels) {
		this.dietLabels = dietLabels;
	}

	@Override
	public String toString() {
		return "Recipe [yield=" + yield + ", label=" + label + ", url=" + url + ", image=" + image + ", dietLabels="
				+ dietLabels + "]";
	}

	

}
