package com.codeup.springbootblog.daos;

import com.codeup.springbootblog.models.Post;
import org.springframework.data.repository.CrudRepository;

//the CrudRepository come with Java and give us access to find and more

public interface PostRepository extends CrudRepository <Post, Long> {
}
