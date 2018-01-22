package com.codeup.springbootblog.controllers;
import com.codeup.springbootblog.models.Post;
import com.codeup.springbootblog.services.PostService;
import javafx.geometry.Pos;
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
    @GetMapping("/posts/create")
//    @ResponseBody
    public String postCreateForm(Model viewAndModel){
        Post post = new Post();
        viewAndModel.addAttribute("post",post);
        return "posts/new";
    }

    @PostMapping("/posts/create")
    @ResponseBody
//    public String savePost(@RequestParam("title") String title, @RequestParam("description") String description){
        public String savePost(@ModelAttribute Post post){
//        Post post = new Post(title,description);
        postService.save(post);
//        return title + " " + description;
        return post.getTitle() + " " + post.getBody();
    }

    @GetMapping("/posts/{id}/edit")
        public String postEdit(@PathVariable int id, Model viewAndModel){
            Post editPost = postService.findOne(id);
            viewAndModel.addAttribute("whatispresentedinthetemplet",editPost);
            return "posts/edit";

    }
    @PostMapping("/posts/update")
    @ResponseBody
//    public String savePost(@RequestParam("title") String title, @RequestParam("description") String description){
    public String updatePost(@ModelAttribute Post post){
//        Post post = new Post(title,description);
        postService.update(post);
//        return title + " " + description;
        return post.getTitle() + " " + post.getBody() + "" + post.getId();
    }

}
