package com.techno.zone.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.CreatedDate;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Post {

	@Id	@GeneratedValue
	private Long id;
	private String title;
	@Column(columnDefinition="TEXT")
	private String body;
	@Column(columnDefinition="TEXT")
	private String teaser;
	@CreatedDate @Column(columnDefinition="TIMESTAMP")
	private Date postedOn;
	
	@ManyToOne
	@JsonBackReference
	private Author author;
	
	// private no arg constructor needed by JPA
	@SuppressWarnings("unused")
	private Post() {}
	
	public Post(String title) {
		this.title = title;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getTeaser() {
		return teaser;
	}
	public void setTeaser(String teaser) {
		this.teaser = teaser;
	}
	public Date getPostedOn() {
		return postedOn;
	}
	public void setPostedOn(Date postedOn) {
		this.postedOn = postedOn;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", title=" + title + ", body=" + body + ", postedOn=" + postedOn + "]";
	}
}