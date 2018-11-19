package com.apidemo.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.apidemo.cards.CardsResult;

@Controller
public class CardController {

	private static final String deckId = "jjpjnvaqkggt";

	@RequestMapping("/draw-cards")
	public ModelAndView draw(@RequestParam("count") int count) {
		ModelAndView mav = new ModelAndView("cards");

		// Create a rest template
		RestTemplate restTemplate = new RestTemplate();

		// Set up headers.
		HttpHeaders headers = new HttpHeaders();
		headers.add(HttpHeaders.USER_AGENT, "Let me in!");

		// Set url
		String url = "https://deckofcardsapi.com/api/deck/" + deckId + "/draw/?count=" + count;

		// Make the Request.
		ResponseEntity<CardsResult> response = restTemplate.exchange(url, HttpMethod.GET, new HttpEntity<>(headers),
				CardsResult.class);

		// Extract body from response.
		CardsResult result = response.getBody();

		mav.addObject("cards", result.getCards());
		return mav;
	}

	@RequestMapping("/shuffle-cards")
	public ModelAndView shuffle() {
		ModelAndView mav = new ModelAndView("cards");

		// Create a rest template
		RestTemplate restTemplate = new RestTemplate();

		// Set up headers.
		HttpHeaders headers = new HttpHeaders();
		headers.add(HttpHeaders.USER_AGENT, "Let me in!");

		// Make the Request.
		restTemplate.exchange("https://deckofcardsapi.com/api/deck/" + deckId + "/shuffle", HttpMethod.GET,
				new HttpEntity<>(headers), Void.class);

		return mav;
	}
}
