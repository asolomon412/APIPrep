package com.apidemo.entity.love;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LoveMatcher {

	@JsonProperty("fname") // use this if names don't match
	private String fname;
	@JsonProperty("sname")
	private String sname;
	@JsonProperty("result")
	private String result;
	@JsonProperty("percentage")
	private String percentage;

	public LoveMatcher() {
		// TODO Auto-generated constructor stub
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getPercentage() {
		return percentage;
	}

	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "LoveMatcher [fname=" + fname + ", sname=" + sname + ", result=" + result + ", percentage=" + percentage
				+ "]";
	}

	
}
