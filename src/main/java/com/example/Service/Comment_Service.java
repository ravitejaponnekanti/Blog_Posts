package com.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.modelmapper.*;

import com.example.Controllers.DTOs.CommentDto;
import com.example.Exceptions.ResourceNotFoundException;
import com.example.Model.Comment;
import com.example.Model.Post;
import com.example.Repos.Comments_Repo;
import com.example.Repos.Post_Repo;

@Service
public class Comment_Service {

	@Autowired
     Comments_Repo comments_repo;
	@Autowired
	Post_Repo post_repo;
	ModelMapper mapper;
	public CommentDto getcomments(long postId, CommentDto commentdto) {
		Post post=post_repo.findById(postId).orElseThrow(()-> new ResourceNotFoundException("Post","ID",postId));
		Comment cmt=new Comment();
		cmt=MapToEntity(commentdto);
		cmt.setPost(post);
		return MapToDto(cmt);
	}
	
	
	private CommentDto MapToDto(Comment cmt) {
		CommentDto cmtdto=mapper.map(cmt, CommentDto.class);
		return cmtdto;
	}
	private Comment MapToEntity(CommentDto cmtdto) {
		Comment cmt= mapper.map(cmtdto, Comment.class);
		return cmt;
	}

}
