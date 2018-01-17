package com.codeup.springbootblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

    public class MathController {
    @GetMapping("/add/{a}/and/{b}")
    @ResponseBody

    public String adding(@PathVariable int a, @PathVariable int b) {
        int c = a + b;
        return "The sum of " + a + " and " + b + " is " + c;
    }

    @GetMapping("/subtract/{a}/and/{b}")
    @ResponseBody

    public String subtracting(@PathVariable int a, @PathVariable int b) {
        int c = a - b;
        return "The subtraction of " + a + " and " + b + " is " + c;
    }

    @GetMapping("/multiply/{a}/and/{b}")
    @ResponseBody

    public String multiplying(@PathVariable int a, @PathVariable int b) {
        int c = a * b;
        return "The multiplication of " + a + " and " + b + " is " + c;
    }

    @GetMapping("/divide/{a}/by/{b}")
    @ResponseBody

    public String dividing(@PathVariable int a, @PathVariable int b) {
        int c = a / b;
        return "The Division of " + a + " by " + b + " is " + c;
    }

}



