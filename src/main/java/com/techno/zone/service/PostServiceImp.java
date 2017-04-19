package com.techno.zone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techno.zone.domain.Post;
import com.techno.zone.repository.PostRepository;

@Service
public class PostServiceImp implements PostService {

	private PostRepository postRepository;
	
	@Autowired
	public PostServiceImp(PostRepository postRepository) {
		this.postRepository = postRepository;
	}

	@Override
	public Post getLastestPost() {
		return postRepository.findFirstByOrderByPostedOnDesc();
	}
}
