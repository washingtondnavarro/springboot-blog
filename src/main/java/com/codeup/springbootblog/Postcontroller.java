package com.codeup.springbootblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class Postcontroller {

    @GetMapping("/posts")
    @ResponseBody
        public String post(){
        return "This is a post";

    }
    @GetMapping("/posts/{id}")
    @ResponseBody
        public String individualPost(@PathVariable long id){
            return "view an individual post";
    }


    @GetMapping("/posts/create")
    @ResponseBody
    public String postCreateForm(){
        return "View the form to create the post";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String postCreateNewPost(){
        return "Create a new Post";

    }
}
