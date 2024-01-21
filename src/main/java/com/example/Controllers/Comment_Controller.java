package com.example.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Controllers.DTOs.CommentDto;
import com.example.Service.Comment_Service;

@RestController
@RequestMapping("/api/post")
public class Comment_Controller {

	@Autowired
	Comment_Service comment_service;
	@PostMapping("/{postId}/comment")
	public ResponseEntity<CommentDto> getComments(@PathVariable long postId,@RequestBody CommentDto commentdto){
		
		return new ResponseEntity<>(comment_service.getcomments(postId,commentdto),HttpStatus.OK);
	}

}
