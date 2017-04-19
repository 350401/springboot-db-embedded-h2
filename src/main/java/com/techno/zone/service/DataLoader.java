package com.techno.zone.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techno.zone.domain.Author;
import com.techno.zone.domain.Post;
import com.techno.zone.repository.AuthorRepository;
import com.techno.zone.repository.PostRepository;

@Service
public class DataLoader {

	private PostRepository postRepository;
	private AuthorRepository authorRepository;

	@Autowired
	public DataLoader(PostRepository postRepository, AuthorRepository authorRepository) {
		this.postRepository = postRepository;
		this.authorRepository = authorRepository;
	}

	@PostConstruct
	private void loadData(){
		
		// create an author
		Author author = new Author("Sameer","Meher");
		authorRepository.save(author);
		
		// create a post
		Post post = new Post("Spring Data Rocks!");
		post.setBody("Post Body here...");
		post.setTeaser("Post Body here...");
		post.setAuthor(author);
		postRepository.save(post);
	}
}