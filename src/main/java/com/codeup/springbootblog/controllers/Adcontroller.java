package com.codeup.springbootblog.controllers;

import com.codeup.springbootblog.models.Ad;
import com.codeup.springbootblog.services.AdService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Controller

public class Adcontroller {
    private AdService service;

    public Adcontroller(AdService service){
        this.service = service;
    }

    @GetMapping("/ads")
    public String showAllAds(Model viewAndModel){
        List<Ad> ads = service.findAll();

        viewAndModel.addAttribute("ads",ads);

        return "ads/index";

    }
}
