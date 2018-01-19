package com.codeup.springbootblog.controllers;

import org.codehaus.groovy.runtime.StringGroovyMethods;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
    public class HomeController {

        @GetMapping("/home")
            public String landingPage() {
            return "home";
        }
        @GetMapping("/hometwo")
            public String secondLandingPage(){
            return "hometwo";
            }
        @GetMapping("/hello/{name}")
            public String sayHello(@PathVariable String name, Model viewmodel){
                viewmodel.addAttribute("name", name);
                return "hello";

        }


    }
