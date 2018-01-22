package com.codeup.springbootblog.services;

import com.codeup.springbootblog.models.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class PostService {
    private List<Post> posts = new ArrayList<>();

    public PostService() {
        createPosts();
    }

    public List<Post> findAll() {
        return posts;
    }

    public Post save(Post post){
        post.setId(posts.size()+1);
        posts.add(post);
        return post;
    }
    public Post update(Post post){
//        post.setId(posts.size()+1);
        posts.set( (int) post.getId()-1, post);
        return post;
    }

    public Post findOne(long id) {
        return posts.get((int)(id-1));
    }


    private void createPosts(){
        save(new Post("Post A", "Body A"));
        save(new Post("Post B", "Body B"));
        save(new Post("Post C", "Body C"));


        }
    }
