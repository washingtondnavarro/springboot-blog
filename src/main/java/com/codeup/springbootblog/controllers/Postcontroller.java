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

            return "posts/show";
    }
//
//
    @GetMapping("/posts/new")
//    @ResponseBody
    public String postCreateForm(){
        return "posts/newFormPost";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String savePost(@RequestParam("title") String title, @RequestParam("description") String description){
        Post post = new Post(title,description);
        postService.save(post);
        return title + " " + description;
    }

//    @PostMapping("/posts/create")
//    public String postCreateNewPost(){
//        return "Create a new Post";
//
//    }
}
