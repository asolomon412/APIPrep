package com.apidemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.apidemo.entity.Quote;

@Controller
public class HomeController {

	@GetMapping("/")
	public ModelAndView index() {

		RestTemplate restTemplate = new RestTemplate();
		Quote quote = restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random",Quote.class);

		return new ModelAndView("index", "quotetest", quote);
	}

}
