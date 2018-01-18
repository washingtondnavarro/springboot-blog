package com.codeup.springbootblog;
import java.util.Random;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class Rolldice {
    //    long option;
    @GetMapping("/roll-dice")
    public String individualDice() {
        return "roll-dice";
    }

    @GetMapping("/roll-dice/{n}")

    public int randomNumber() {
        Random rand = new Random();
        int n = rand.nextInt(6) + 1;
        return n;
    }


    @GetMapping("/hello/{value}")
    public String gettingArgument(@PathVariable String value, Model viewmodel) {
        viewmodel.addAttribute("value", value);
        return "hello";

    }
}

