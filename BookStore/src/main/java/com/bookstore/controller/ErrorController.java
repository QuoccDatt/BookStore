package com.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/templates/error")
public class ErrorController {
     @GetMapping("/403")
    public String accesDenied(){
         return "templates/error/403";
     }
}