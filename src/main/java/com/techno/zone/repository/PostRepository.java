package com.techno.zone.repository;

import org.springframework.data.repository.CrudRepository;
import com.techno.zone.domain.Post;

public interface PostRepository extends CrudRepository<Post, Long> {

	Post findFirstByOrderByPostedOnDesc();

	Post findFirstByOrderByPostedOnAsc();
}