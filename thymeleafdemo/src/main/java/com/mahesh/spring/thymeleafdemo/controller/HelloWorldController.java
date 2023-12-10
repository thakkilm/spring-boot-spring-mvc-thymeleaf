package com.mahesh.spring.thymeleafdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }

    @RequestMapping("/processFormVersion2")
    public String convertToUpperCase(HttpServletRequest http, Model theModel){
        String studentName=http.getParameter("studentName").toUpperCase();
        theModel.addAttribute("message",studentName);
        return  "helloworld";

    }
}
