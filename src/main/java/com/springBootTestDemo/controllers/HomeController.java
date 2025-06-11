package com.springBootTestDemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello World!";
    }

    @RequestMapping("/username/{username}")
    public @ResponseBody String greetUser(@PathVariable String username) {
        return "Hello " + username + "!";
    }
}
