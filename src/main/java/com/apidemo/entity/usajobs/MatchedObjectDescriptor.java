package com.apidemo.entity.usajobs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MatchedObjectDescriptor {

	@JsonProperty("PositionTitle")
	private String positionTitle;
	@JsonProperty("PositionURI")
	private String positionUri;
	public MatchedObjectDescriptor() {
		// TODO Auto-generated constructor stub
	}
	public String getPositionTitle() {
		return positionTitle;
	}
	public void setPositionTitle(String positionTitle) {
		this.positionTitle = positionTitle;
	}
	public String getPositionUri() {
		return positionUri;
	}
	public void setPositionUri(String positionUri) {
		this.positionUri = positionUri;
	}
	@Override
	public String toString() {
		return "MatchedObjectDescriptor [positionTitle=" + positionTitle + ", positionUri=" + positionUri + "]";
	}
	
	
}
