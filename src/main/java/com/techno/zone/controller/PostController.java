package com.techno.zone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techno.zone.domain.Post;
import com.techno.zone.service.PostService;

@RestController
public class PostController {

	private PostService postService;
	
	@Autowired
	public PostController(PostService postService) {
		this.postService = postService;
	}

	@RequestMapping(value = "/latest-post", produces = {MediaType.APPLICATION_JSON_VALUE})
	public Post getAssessmentRecord() {
		return postService.getLastestPost();
	}
}