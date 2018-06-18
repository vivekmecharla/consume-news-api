package com.example.project;

import org.json.JSONException;
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

			return restTemplate.getForObject(getUrl, News.class);

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
