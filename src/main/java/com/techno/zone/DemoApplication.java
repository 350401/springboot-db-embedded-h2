package com.techno.zone;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.techno.zone.domain.Post;
import com.techno.zone.repository.PostRepository;
import com.techno.zone.service.DataLoader;

@SpringBootApplication
public class DemoApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);
	
	@Autowired
	PostRepository postRepository;
	
	@Autowired
	DataLoader dataLoader;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@PostConstruct
	public void getAllPosts() {
		logger.info("getAllPosts called");
		for( Post post : postRepository.findAll() ) {
			logger.info(post.toString());
		}
	}
}
