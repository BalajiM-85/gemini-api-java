package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.service.GeminiAPIService;

@RestController
public class AppController {
	
	GeminiAPIService geminiAPIService;

	public AppController(GeminiAPIService
			 geminiAPIService) {
		this.geminiAPIService = geminiAPIService;
	}
	
	@GetMapping(path = "/hello")
	public String hello() {
		return "Hello Programmer";
	}
	
	@GetMapping(path = "/myai")
	public String myai(@RequestParam String query) {		
		return this.geminiAPIService.getReponse(query);
	}
}
