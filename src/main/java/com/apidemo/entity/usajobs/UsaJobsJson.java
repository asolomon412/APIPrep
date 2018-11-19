package com.apidemo.entity.usajobs;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class UsaJobsJson {
	@JsonProperty("LanguageCode")
	private String languageCode;
	@JsonProperty("SearchResult")
	private SearchResult sr;

	public UsaJobsJson() {
		// TODO Auto-generated constructor stub
	}

	public String getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	public SearchResult getSr() {
		return sr;
	}

	public void setSr(SearchResult sr) {
		this.sr = sr;
	}

	@Override
	public String toString() {
		return "UsaJobsJson [languageCode=" + languageCode + ", sr=" + sr + "]";
	}
	
	
}
