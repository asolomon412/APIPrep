package com.apidemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.apidemo.entity.recipe.RecipeJson;

@Controller
public class RecipeController {
	@Value("${edmam.key}")
	String edmamKey;

	@Value("${edmam.id}")
	String edmamId;

	// "https://api.edamam.com/search?q=chicken&app_id=${YOUR_APP_ID}&app_key=${YOUR_APP_KEY}&from=0&to=3&calories=591-722&health=alcohol-free"
	@GetMapping("/recipe")
	public ModelAndView recipe(@RequestParam("foodtype") String food) {

		RestTemplate restTemplate = new RestTemplate();
		RecipeJson result = restTemplate.getForObject("https://api.edamam.com/search?q=" + food + "&app_id=" + edmamId
				+ "&app_key=" + edmamKey + "&from=0&to=20&calories=591-2000&health=alcohol-free", RecipeJson.class);
		System.out.println(result);

		return new ModelAndView("recipepage", "recipeResult", result);
	}
}
