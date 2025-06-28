package com.demo.service;

import org.springframework.stereotype.Service;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;

@Service
public class GeminiAPIService {

	public String getReponse(String query) {
		String response = "Default response";
		try (Client client = new Client()) {
		// The client gets the API key from the environment variable `GEMINI_API_KEY`.

	    GenerateContentResponse contentResponse =
	        client.models.generateContent(
	            "gemini-2.5-flash",
	            query,
	            null);
	    	response = contentResponse.text();
		} catch (Exception ex) {
			response = ex.getMessage();
		}

		
		return response;
	}
}
