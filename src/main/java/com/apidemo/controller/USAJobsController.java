package com.apidemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.apidemo.entity.usajobs.UsaJobsJson;

@Controller
public class USAJobsController {

	@Value("${usajobs.key}")
	String jobKey;
	@RequestMapping("/usajobs") 
	public ModelAndView usaJobs() { 
		// add headers to our API request
		HttpHeaders headers = new HttpHeaders();
		headers.add("Host", "data.usajobs.gov");
		headers.add("User-Agent", "antonellasolomon@gmail.com"); 
		headers.add("Authorization-Key", jobKey); // adding the key from the application.properties file
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		
		// to attach the headers to our request we need the HttpEntity
		HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
		
		RestTemplate restTemplate = new RestTemplate(); // https://data.usajobs.gov/api/search?JobCategoryCode=2210
		ResponseEntity<UsaJobsJson> response = restTemplate.exchange("https://data.usajobs.gov/api/search?Keyword=computer", // using parameter for keyword search 
				
				HttpMethod.GET, entity, UsaJobsJson.class);
		// test to make sure we are getting data back
		System.out.println(response.getBody());
		
		
		return new ModelAndView("usajobs", "match", response.getBody()); // reminder to fill this in
	}
}
