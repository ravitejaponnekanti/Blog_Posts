package com.example.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data@AllArgsConstructor
@NoArgsConstructor


@Entity
@Table(name="Posts")
public class Post {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="title", nullable=false)
	private String title;
	@Column(name="Description",nullable=false)
	private String Description;
	@Column(name="Content",nullable=false)
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
	public Post() {
		super();
	}
	public Post(Long id, String title, String description, String content) {
		super();
		this.id = id;
		this.title = title;
		Description = description;
		Content = content;
	}
	

}
