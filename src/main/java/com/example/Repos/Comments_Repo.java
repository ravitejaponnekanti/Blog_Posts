package com.example.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Model.Comment;

public interface Comments_Repo extends JpaRepository<Comment,Integer> {

}
