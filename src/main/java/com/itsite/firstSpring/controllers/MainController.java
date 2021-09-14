package com.itsite.firstSpring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/home")
    public String home( Model model) {
        model.addAttribute("title", "Main page");
        return "home";
    }


    @GetMapping("/about")
    public String about( Model model) {
        model.addAttribute("title", "Page about us");
        return "about";
    }

}