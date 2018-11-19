package com.apidemo.entity.recipe;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
// this is the utmost parent in the json tree
// used this as a starting point to demonstrate the type
@JsonIgnoreProperties(ignoreUnknown = true)
public class RecipeJson {

	private String q;
	@JsonProperty("hits")
	private ArrayList<Hits> hits;

	public RecipeJson() {
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Hits> getHits() {
		return hits;
	}

	public void setHits(ArrayList<Hits> hits) {
		this.hits = hits;
	}

	public String getQ() {
		return q;
	}

	public void setQ(String q) {
		this.q = q;
	}

	@Override
	public String toString() {
		return "RecipeJson [q=" + q + ", hits=" + hits + "]";
	}



}
