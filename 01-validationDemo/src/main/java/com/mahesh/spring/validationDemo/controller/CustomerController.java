package com.mahesh.spring.validationDemo.controller;

import com.mahesh.spring.validationDemo.model.Customer;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {

    @GetMapping("/")
    public String customerForm(Model theModel){

        theModel.addAttribute("customer",new Customer());
        return "customer-form";
    }

    @PostMapping("/processForm")
    public String processForm(@Valid @ModelAttribute("customer") Customer theCustomer, BindingResult bindingResult){
        System.out.println("Called the method");
    if(bindingResult.hasErrors()){
        return "customer-form";
    }
    else{
        return "process-confirmation";

    }
    }
}
