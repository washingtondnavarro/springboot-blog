package com.codeup.springbootblog.controllers;
//import com.codeup.springbootblog.daos.PostRepository;
import com.codeup.springbootblog.models.Post;
import com.codeup.springbootblog.services.PostService;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;



@Controller
public class Postcontroller {

    private PostService postService;
//    private PostRepository postDao;
//
//    public Postcontroller(PostRepository postDao) {
//        this.postDao = postDao;
//    }
    public Postcontroller(PostService postService) {
        this.postService = postService;
    }


        @RequestMapping("/posts")
            public String index(Model viewAndModel) {
            Iterable<Post> posts = postService.findAll();
            viewAndModel.addAttribute("posts", posts);
            return "posts/index";
        }


////
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
//      @ResponseBody
//         this part is to show the form
//          the Model is to pass the initial empty post
            public String postCreateForm(Model viewAndModel){
            Post post = new Post();
            viewAndModel.addAttribute("post",post);
            return "posts/new";
        }

        @PostMapping("/posts/create")
//          @ResponseBody
//          public String savePost(@RequestParam("title") String title, @RequestParam("description") String description){
            public String savePost(@ModelAttribute Post post){
//          Post post = new Post(title,description);
            postService.save(post);
//          return title + " " + description;
//          return post.getTitle() + " " + post.getBody();
            return "redirect:/posts";
        }

        @GetMapping("/posts/{id}/edit")
            public String postEdit(@PathVariable long id, Model viewAndModel){
            Post editPost = postService.findOne(id);
            viewAndModel.addAttribute("post",editPost);
            return "posts/edit";

        }
//        @PostMapping("/posts/update")
////          @ResponseBody
////          public String savePost(@RequestParam("title") String title, @RequestParam("description") String description){
//            public String updatePost(@ModelAttribute Post post){
////          Post post = new Post(title,description);
//            postDao.save (post);
////          return title + " " + description;
////          return post.getTitle() + " " + post.getBody() + "" + post.getId();
//            return"redirect:/posts";
//          }
        @PostMapping("/posts/{id}/edit")
            public String updatePost(@PathVariable long id, @ModelAttribute Post post){
                post.setId(id);
                postService.save(post);
                return "redirect:/posts";
        }


        @PostMapping("/posts/{id}/delete")
            public String deletePost(@PathVariable long id){
            postService.delete(id);
            return "redirect:/posts";
        }



}
