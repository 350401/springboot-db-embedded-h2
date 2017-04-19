package com.techno.zone.repository;

import org.springframework.data.repository.CrudRepository;

import com.techno.zone.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
