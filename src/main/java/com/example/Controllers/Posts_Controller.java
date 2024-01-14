package com.example.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Controllers.DTOs.PostDtos;
import com.example.Service.Post_Service;

@RestController
@RequestMapping("/api")
public class Posts_Controller {
	@Autowired
	Post_Service PostService;
	
	
	@GetMapping("/AllPosts")
	public ResponseEntity<List<PostDtos>> getAllPost(){
		return new ResponseEntity<>(PostService.getAllPosts(),HttpStatus.OK);
	}
	
	@GetMapping("/Post/{id}")
	public ResponseEntity<PostDtos> getByPostId(@PathVariable Long id){
		return new ResponseEntity<>(PostService.getByPostId(id),HttpStatus.OK) ;
		
	}
	
	@PostMapping("/CreatePost")
	public ResponseEntity<PostDtos> createPost(@RequestBody PostDtos postdtos){
		return new ResponseEntity<>(PostService.CreatePost(postdtos),HttpStatus.CREATED);
	}
	
	@PutMapping("/Post/{id}")
	public ResponseEntity<PostDtos> updatePost(@PathVariable long id,@RequestBody PostDtos postdtos){
		return new ResponseEntity<PostDtos>(PostService.updateByPostId(id,postdtos),HttpStatus.OK);
	}
	
	@DeleteMapping("/Post/{id}")
	public ResponseEntity<String> deletePost(@PathVariable Long id){
		PostService.deletePost(id);
		return new ResponseEntity<>("Post Entity deleted SuccessFully",HttpStatus.OK);
	}
	

}
