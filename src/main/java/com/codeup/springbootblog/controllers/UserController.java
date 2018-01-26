package com.codeup.springbootblog.controllers;

import com.codeup.springbootblog.models.User;
import com.codeup.springbootblog.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {
    private UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }
    @RequestMapping("/users")
        public String users(Model viewAndModel){
        Iterable<User> users = userService.findAll();
        viewAndModel.addAttribute("users", users);
        return "users/index";
    }

//     the path @PathVariable will help us to get the information and pass it to the templet(HTML)

    @GetMapping("/users/{id}")
        public String showUserInfo(@PathVariable long id, Model viewAndModel ){
        User user =userService.findOne(id);
        viewAndModel.addAttribute("user",user);
        return "users/user";
    }
// this is to call the form to create the user and present it in the templet
    @GetMapping("/users/create")
        public String userCreateForm(Model viewAndModel){
//             this is to call the empty from to create a new User
            User user = new User();
            viewAndModel.addAttribute("user", user);
            return "users/newUser";
    }
// this is to recieve the infromation coming from the HTML from and sent it to the DB
    @PostMapping("/user/create")
    public  String saveNewUser(@ModelAttribute User user){
            userService.save(user);
            return "redirect:/users";
    }

    @GetMapping("/users/{id}/edit")
        public String userEditInfo(@PathVariable long id, Model viewAndModel){
        User editUserInfo =userService.findOne(id);
        viewAndModel.addAttribute("user",editUserInfo);
        return "users/editUser";
    }

    @PostMapping("/users/{id}/edit")
        public String updatedUserInfo(@PathVariable long id, @ModelAttribute User user){
            user.setId(id);
            userService.save(user);
            return "redirect:/users";
    }

    @PostMapping("/users/{id}/delete")
        public String deleteUser(@PathVariable long id){
        userService.delete(id);
        return "redirect:/users";
    }

//    sending to edit post for a specific post fro specific user
//    i think this will have to be modified at the post level

//    same with delete




}
