package com.example.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Controllers.DTOs.PostDtos;
import com.example.Exceptions.ResourceNotFoundException;
import com.example.Repos.Post_Repo;
import com.example.Model.*;

@Service
public class Post_Service {
	
	@Autowired
	Post_Repo PostRepo;

	public PostDtos CreatePost(PostDtos postdtos) {
		Post post=maptoModelPost(postdtos);
		Post newpost= PostRepo.save(post);
		PostDtos postdto=mapToDto(newpost);
		return postdto;
	}

	public List<PostDtos> getAllPosts() {
		List<Post> posts=PostRepo.findAll();
		return posts.stream()
				.map(post->mapToDto(post))
				.collect(Collectors.toList());	
		}
	
	public PostDtos getByPostId(Long id) {
		Optional<Post> post=PostRepo.findById(id);
		if(!post.isPresent()) {
			throw new ResourceNotFoundException("Post","ID",id);
		}else {
			PostDtos postdto=mapToDto(post.get());
			return postdto;
		}
	}
	

	public PostDtos updateByPostId(long id,PostDtos postdtos) {
		Post post=PostRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Post","ID",id));
		post.setContent(postdtos.getContent());
		post.setDescription(postdtos.getDescription());
		post.setTitle(postdtos.getTitle());
		Post updatedpost=PostRepo.save(post);

		return mapToDto(updatedpost);
	}

	public void deletePost(Long id) {
		Post post=PostRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Post","ID",id));
		 PostRepo.delete(post);
	}

	
	
	
	private PostDtos mapToDto(Post post) {
		PostDtos postdto=new PostDtos();
		postdto.setContent(post.getContent());
		postdto.setDescription(post.getDescription());
		postdto.setTitle(post.getTitle());
		postdto.setId(post.getId());
		return postdto;	
	}
    private Post maptoModelPost(PostDtos postdtos) {
    	Post post=new Post();
		post.setTitle(postdtos.getTitle());
		post.setDescription(postdtos.getDescription());
		post.setContent(postdtos.getContent());
    	return post;
    }

}
