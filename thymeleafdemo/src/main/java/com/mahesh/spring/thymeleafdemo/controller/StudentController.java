package com.mahesh.spring.thymeleafdemo.controller;


import com.mahesh.spring.thymeleafdemo.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class StudentController {
@Value("${countries}")
private List<String> countries;
    @GetMapping("/showStudentForm")
    public String showForm(Model theModel){

        theModel.addAttribute("student",new Student());
        theModel.addAttribute("countries",countries);
        return "student-form";

    }


    @PostMapping("/processStudentForm")
    public String processStudentForm(@ModelAttribute("student") Student student){

        System.out.println(student.getFirstName()+" "+student.getLastName());
        return "student-confirmation";

    }
}
