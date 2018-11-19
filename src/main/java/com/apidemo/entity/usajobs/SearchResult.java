package com.apidemo.entity.usajobs;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class SearchResult {
	@JsonProperty("SearchResultItems")
	private ArrayList<StringResultItems> items;

	public SearchResult() {
		// TODO Auto-generated constructor stub
	}

	public ArrayList<StringResultItems> getItems() {
		return items;
	}

	public void setItems(ArrayList<StringResultItems> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "SearchResult [items=" + items + "]";
	}

	
	
}
