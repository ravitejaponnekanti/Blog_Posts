package com.example.Controllers.DTOs;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class PostDtos {
	private Long id;
	private String title;
	private String Description;
	private String Content;
	public Long getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getDescription() {
		return Description;
	}
	public String getContent() {
		return Content;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public void setContent(String content) {
		Content = content;
	}
	public PostDtos(Long id, String title, String description, String content) {
		super();
		this.id = id;
		this.title = title;
		Description = description;
		Content = content;
	}
	public PostDtos() {
		super();
	}
	

}
