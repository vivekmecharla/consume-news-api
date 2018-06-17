package com.example.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/news/")
public class NewsController {

	@Autowired
	private NewsService newsService;

	@RequestMapping("/topstories")
	public News getNews() throws Exception {
		return newsService.getTopStories();
	}

}
