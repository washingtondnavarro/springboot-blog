//package com.codeup.springbootblog.controllers;
//
//import com.codeup.springbootblog.daos.PostRepository;
//import com.codeup.springbootblog.models.Post;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//@Controller
//public class ProfileController {
////    private PostService postService;
//    private PostRepository postDao;
//
//    public ProfileController(PostRepository postDao) {
//        this.postDao = postDao;
//    }
//        @RequestMapping("/posts")
//            public String index(Model viewAndModel) {
//                Iterable<Post> posts = postDao.findAll();
//                viewAndModel.addAttribute("posts",posts);
//                return "posts/index";
//    }
////
////
////    @GetMapping("/posts/show")
//////        public String post(){
//////        return "This is for all the  posts";
////
//////    }
//    @RequestMapping("/posts/{id}")
//        public String show (@PathVariable long id, Model viewAndModel){
//        Post post = postDao.findOne(id);
//
//        viewAndModel.addAttribute("post",post);
//
//            return "posts/show";
//    }
////
////
//    @GetMapping("/posts/create")
////    @ResponseBody
//    public String postCreateForm(Model viewAndModel){
//        Post post = new Post();
//        viewAndModel.addAttribute("post",post);
//        return "posts/new";
//    }
//
//    @PostMapping("/posts/create")
//    @ResponseBody
////    public String savePost(@RequestParam("title") String title, @RequestParam("description") String description){
//        public String savePost(@ModelAttribute Post post){
////        Post post = new Post(title,description);
//        postDao.save(post);
////        return title + " " + description;
//        return post.getTitle() + " " + post.getBody();
//    }
//
//    @GetMapping("/posts/{id}/edit")
//        public String postEdit(@PathVariable long id, Model viewAndModel){
//            Post editPost = postDao.findOne(id);
//            viewAndModel.addAttribute("whatispresentedinthetemplet",editPost);
//            return "posts/edit";
//
//    }
//    @PostMapping("/posts/update")
////    @ResponseBody
////    public String savePost(@RequestParam("title") String title, @RequestParam("description") String description){
//    public String updatePost(@ModelAttribute Post post){
////        Post post = new Post(title,description);
//        postDao.save (post);
////        return title + " " + description;
////        return post.getTitle() + " " + post.getBody() + "" + post.getId();
//        return"redirect:/posts";
//    }
//
//    @PostMapping("/posts/delete")
//        public String deletePost(@ModelAttribute Post whatispresentedinthetemplet){
//        postDao.delete(whatispresentedinthetemplet.getId());
//        return "redirect:/posts";
//    }
//
//
//
//}
