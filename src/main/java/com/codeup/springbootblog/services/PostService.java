package com.codeup.springbootblog.services;

import com.codeup.springbootblog.daos.PostDao;
import com.codeup.springbootblog.models.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class PostService {
    private PostDao postDao;
//    private List<Post> posts = new ArrayList<>();

    public PostService(PostDao postDao){
        this.postDao = postDao;
    }

//    public PostService() {
//        createPosts();
//    }


//    public Post save(Post post){
//        post.setId(posts.size()+1);
//        posts.add(post);
//        return post;
//    }
//    public Post update(Post post){
////        post.setId(posts.size()+1);
////        posts.set(post.getId()-1);
//        return post;
//    }

    public void save(Post post){
        postDao.save(post);
    }

//    public List<Post> findAll() {
//        return posts;
//    }
//    private void createPosts(){
//        save(new Post("Post A", "Body A"));
//        save(new Post("Post B", "Body B"));
//        save(new Post("Post C", "Body C"));

    public Iterable<Post> findAll(){
        return postDao.findAll();
    }
//    public Post findOne(long id) {
//        return posts.get((int)(id-1));
//    }

    public Post findOne(long id){
        return postDao.findOne(id);
    }

    public void delete(long id){
        postDao.delete(id);
    }

    }
