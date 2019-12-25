package com.team.ocr.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {
    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "You made it!";
    }
    // Login form
    @RequestMapping("/loginn")
    public String login() {
        return "login.html";
    }
    // Login form with error
    @RequestMapping("/login-error.html")
    public String loginError(Model model) {
        model.addAttribute("loginError", true);
        return "login.html";
    }
}