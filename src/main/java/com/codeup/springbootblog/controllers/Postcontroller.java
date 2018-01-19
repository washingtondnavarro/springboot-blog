package com.codeup.springbootblog.controllers;
import com.codeup.springbootblog.models.Post;
import com.codeup.springbootblog.services.PostService;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class Postcontroller {
    private PostService postService;

    public Postcontroller(PostService postService) {
        this.postService = postService;
    }
        @RequestMapping("/posts")
            public String index(Model viewAndModel) {
                List<Post> posts = postService.findAll();
                viewAndModel.addAttribute("posts",posts);
                return "posts/index";
    }
//
//
//    @GetMapping("/posts/show")
////        public String post(){
////        return "This is for all the  posts";
//
////    }
    @RequestMapping("/posts/{id}")
        public String show (@PathVariable long id, Model viewAndModel){
        Post post = postService.findOne(id);
        viewAndModel.addAttribute("post",post);

//    }
//        public String show(@PathVariable long id, Model viewAndModel){
//            Post post = new Post("Test post", "Test post");
//            viewAndModel.addAttribute("post", post);
            return "posts/show";
    }
//
//
//    @GetMapping("/posts/create")
//    @ResponseBody
//    public String postCreateForm(){
//        return "View the form to create the post";
//    }
//
//    @PostMapping("/posts/create")
//    @ResponseBody
//    public String postCreateNewPost(){
//        return "Create a new Post";
//
//    }
}
