package com.mahesh.spring.thymeleafdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    @GetMapping("/showForm")
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

    @PostMapping("/processFormVersion3")
    public String convertToUpperCase(@RequestParam("studentName") String studentName, Model theModel){
      studentName=studentName.toUpperCase();
        theModel.addAttribute("message",studentName);
        return  "helloworld";

    }


}
