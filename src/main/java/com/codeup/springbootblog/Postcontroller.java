package com.codeup.springbootblog;
import com.codeup.springbootblog.models.Post;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class Postcontroller {
    @RequestMapping("/posts")
            public String index(Model viewAndModel) {
                List<Post> posts = Arrays.asList(
                        new Post("Post A", "Body A") ,
                        new Post("Post B", "Body B") ,
                        new Post("Post C", "Body C")
                );
                viewAndModel.addAttribute("post",posts);
                return "posts/index";
    }


//    @GetMapping("/posts/show")
//        public String post(){
//        return "This is for all the  posts";

//    }
    @RequestMapping("/posts/{id}")
        public String show(@PathVariable long id, Model viewAndModel){
            Post post = new Post("Test post", "Test post");
            viewAndModel.addAttribute("post", post);
            return "posts/show";
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
