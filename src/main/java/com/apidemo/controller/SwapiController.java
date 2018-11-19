package com.apidemo.controller;

import java.util.ArrayList;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.apidemo.entity.swapi.Person;
import com.apidemo.entity.swapi.Result;

@Controller
public class SwapiController {

	@RequestMapping("/people")
	public ModelAndView peopleSelect() {

		HttpHeaders headers = new HttpHeaders();
		headers.add(HttpHeaders.USER_AGENT, "Let me in!");

		RestTemplate restTemplate = new RestTemplate();

		// Make the Request.
		ResponseEntity<Result> response = restTemplate.exchange("https://swapi.co/api/people/?format=json",
				HttpMethod.GET, new HttpEntity<>(headers), Result.class);

		System.out.println(response);

		ArrayList<Person> people = response.getBody().getResult();
		return new ModelAndView("personselect", "people", people);
	}

	@PostMapping("/personspecs")
	public ModelAndView specs(@RequestParam("person") int num) {


		HttpHeaders headers = new HttpHeaders();
		headers.add(HttpHeaders.USER_AGENT, "Let me in!");
		RestTemplate restTemplate = new RestTemplate(); 

		
		ResponseEntity<Person> result = restTemplate.exchange("https://swapi.co/api/people/" + num + "/?format=json",
				HttpMethod.GET, new HttpEntity<>(headers), Person.class);
		System.out.println(result);

		return new ModelAndView("personresults", "person", result.getBody());
	}

}
