package com.apidemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.apidemo.entity.love.LoveMatcher;

@Controller
public class LoveController {
	
	// demonstrating how to hide secret keys in the application.properties file
	@Value("${mashape.key}")
	String loveKey;
	
	@RequestMapping("/love")
	public ModelAndView loveCalc(@RequestParam("fname") String first, @RequestParam("sname") String second) {
		// add headers to our API request
		HttpHeaders headers = new HttpHeaders();
		headers.add("X-Mashape-Key", loveKey); // adding the key from the application.properties file
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		
		// to attach the headers to our request we need the HttpEntity
		HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<LoveMatcher> response = restTemplate.exchange("https://love-calculator.p.mashape.com/getPercentage?fname=" + first+ "&sname=" + second,
				
				HttpMethod.GET, entity, LoveMatcher.class);
		// test to make sure we are getting data back
		System.out.println(response.getBody());
		LoveMatcher loveMatch = response.getBody(); // can assign the response the an object of the type
		
		return new ModelAndView("lovematch", "match", loveMatch); // reminder to fill this in
	}

}
