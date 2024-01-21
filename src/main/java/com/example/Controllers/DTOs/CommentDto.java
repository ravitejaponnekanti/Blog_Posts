package com.example.Controllers.DTOs;

import com.example.Model.Post;

public class CommentDto {
	private String email;
	private String name;
	private String body;
	private Post post;
	public String getEmail() {
		return email;
	}
	public String getName() {
		return name;
	}
	public String getBody() {
		return body;
	}
	public Post getPost() {
		return post;
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
	public void setPost(Post post) {
		this.post = post;
	}
	public CommentDto(String email, String name, String body, Post post) {
		super();
		this.email = email;
		this.name = name;
		this.body = body;
		this.post = post;
	}
	public CommentDto() {
		super();
	}
	

}
