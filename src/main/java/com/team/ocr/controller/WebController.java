package com.team.ocr.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {


    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "Working!";
    }
    // Login form
    @GetMapping("/login")
    public String resultsPage(Model model) {
        model.addAttribute("appName", "sdg");
        return "results";
    }
    // Login form with error
    /*
    @RequestMapping("/login-error.html")
    public String loginError(Model model) {
        model.addAttribute("loginError", true);
        return "login.html";
    }*/
}