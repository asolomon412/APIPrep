package com.apidemo.entity.recipe;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

// using this class to represent the array of 
// recipes that are returned as hits
@JsonIgnoreProperties(ignoreUnknown = true)
public class Hits {

	@JsonProperty("recipe")
	private Recipe recipes;

	// used these to test that something was coming back
	private String bookmarked;
	private String bought;

	public Hits() {
		// TODO Auto-generated constructor stub
	}

	public String getBookmarked() {
		return bookmarked;
	}

	public void setBookmarked(String bookmarked) {
		this.bookmarked = bookmarked;
	}

	public String getBought() {
		return bought;
	}

	public void setBought(String bought) {
		this.bought = bought;
	}

	public Recipe getRecipes() {
		return recipes;
	}

	public void setRecipes(Recipe recipes) {
		this.recipes = recipes;
	}

	@Override
	public String toString() {
		return "Hits [recipes=" + recipes + ", bookmarked=" + bookmarked + ", bought=" + bought + "]";
	}

}
