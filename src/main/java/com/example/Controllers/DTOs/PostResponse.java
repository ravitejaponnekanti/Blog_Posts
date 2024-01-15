package com.example.Controllers.DTOs;

import java.util.List;

import lombok.Data;

@Data
public class PostResponse {

	private List<PostDtos> content;
	private int pageNo;
	private int pageValue;
	private long totalElements;
	private int totalPages;
	private boolean last;
	public List<PostDtos> getContent() {
		return content;
	}
	public int getPageNo() {
		return pageNo;
	}
	public int getPageValue() {
		return pageValue;
	}
	public long getTotalElements() {
		return totalElements;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public boolean isLast() {
		return last;
	}
	public void setContent(List<PostDtos> content) {
		this.content = content;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public void setPageValue(int pageValue) {
		this.pageValue = pageValue;
	}
	public void setTotalElements(long totalElements) {
		this.totalElements = totalElements;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public void setLast(boolean last) {
		this.last = last;
	}
	public PostResponse(List<PostDtos> content, int pageNo, int pageValue, long totalElements, int totalPages,
			boolean last) {
		super();
		this.content = content;
		this.pageNo = pageNo;
		this.pageValue = pageValue;
		this.totalElements = totalElements;
		this.totalPages = totalPages;
		this.last = last;
	}
	public PostResponse() {
		super();
	}
	
}
