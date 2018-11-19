package com.apidemo.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.apidemo.entity.github.GithubJob;

@Controller
public class GithubJobsController {

	@GetMapping("/gitjobs")
	public ModelAndView index() {

		RestTemplate restTemplate = new RestTemplate();
		GithubJob[] quote = restTemplate.getForObject("https://jobs.github.com/positions.json?description=java&page=1",
				GithubJob[].class);
		System.out.println(Arrays.asList(quote));
		return new ModelAndView("gitjobs", "githubresults", quote);
	}
}
