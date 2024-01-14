package com.example.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Model.Post;

@Repository
public interface Post_Repo extends JpaRepository<Post,Long> {

}
