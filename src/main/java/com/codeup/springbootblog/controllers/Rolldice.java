package com.codeup.springbootblog.controllers;
import java.util.Random;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class Rolldice {
    //    long option;
//    @GetMapping("/rolldelete.html")
//    public String individualDice() {
//        return "rolldelete.html";
//    }

    @GetMapping("/roll-dice")
    public String randomNumber(@RequestParam(value = "guessNumber", defaultValue = "0") int guessNumber, Model vmodel) {
        System.out.println(guessNumber);
        Random rand = new Random();
        int diceNumber = rand.nextInt(6) + 1;
        vmodel.addAttribute("diceNumber", diceNumber);
        vmodel.addAttribute("guessNumber",guessNumber);
            String message;
        if(diceNumber == guessNumber){
             message = "Your Guess is correct BRO!";
        }else {
             message = "You lose bitch!";
        }
        vmodel.addAttribute("message",message);

        return "rolldelete.html";
    }


    }


