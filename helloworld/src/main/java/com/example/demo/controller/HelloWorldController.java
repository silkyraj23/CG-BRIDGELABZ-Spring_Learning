package com.example.demo.controller;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    @GetMapping("/Web")
    public String hello(){
        return "hello";
    }

    @GetMapping("/Web/message")
    public String message(Model model){
        model.addAttribute("message","This is value from Model");
        return "message";

    }

}
