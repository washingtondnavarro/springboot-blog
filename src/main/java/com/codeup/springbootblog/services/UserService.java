package com.codeup.springbootblog.services;

import com.codeup.springbootblog.daos.PostDao;
import com.codeup.springbootblog.daos.UserDao;
import com.codeup.springbootblog.models.Post;
import com.codeup.springbootblog.models.User;
import org.springframework.stereotype.Service;

@Service

public class UserService {
    private UserDao userDao;
//    private List<Post> posts = new ArrayList<>();

    public UserService(UserDao userDao){
        this.userDao = userDao;
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

    public void save(User user){
        userDao.save(user);
    }

//    public List<Post> findAll() {
//        return posts;
//    }
//    private void createPosts(){
//        save(new Post("Post A", "Body A"));
//        save(new Post("Post B", "Body B"));
//        save(new Post("Post C", "Body C"));

    public Iterable<User> findAll(){
        return userDao.findAll();
    }
//    public Post findOne(long id) {
//        return posts.get((int)(id-1));
//    }

    public User findOne(long id){
        return userDao.findOne(id);
    }

    public void delete(long id){
        userDao.delete(id);
    }

    }
