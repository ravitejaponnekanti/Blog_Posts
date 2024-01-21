package com.example.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Comment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String email;
	private String name;
	private String body;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="post_id",nullable=false)
	private Post post;
	
	public String getEmail() {
		return email;
	}
	public Post getPost() {
		return post;
	}
	public void setPost(Post post) {
		this.post = post;
	}
	public String getName() {
		return name;
	}
	public String getBody() {
		return body;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public Comment(int id, String email, String name, String body) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.body = body;
	}
	public Comment() {
		super();
	}
	
	

}
