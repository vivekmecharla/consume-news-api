package com.example.project;

import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NewsService {

	static RestTemplate restTemplate;

	public NewsService() {

		restTemplate = new RestTemplate();

	}

	/**
	 * 
	 * get entity
	 * 
	 * @throws JSONException
	 * 
	 */

	public News getTopStories() {
		try {

			String getUrl = "https://api.nytimes.com/svc/topstories/v2/home.json?api-key=08a6a865d11f442687983ced62e1a67d";

			JSONObject news = restTemplate.getForObject(getUrl, JSONObject.class, new News());
			return new News();

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
