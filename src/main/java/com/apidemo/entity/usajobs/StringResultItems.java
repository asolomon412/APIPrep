package com.apidemo.entity.usajobs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class StringResultItems {
	@JsonProperty("MatchedObjectDescriptor")
	private MatchedObjectDescriptor match;

	public StringResultItems() {
		// TODO Auto-generated constructor stub
	}

	public MatchedObjectDescriptor getMatch() {
		return match;
	}

	public void setMatch(MatchedObjectDescriptor match) {
		this.match = match;
	}

	@Override
	public String toString() {
		return "StringResultItems [match=" + match + "]";
	}

	
}
