package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("Home Page Controller");
        model.addAttribute("name", "Substring Technologies");
        model.addAttribute("youtubeChannel", "spardhavar9871");
        model.addAttribute("githubUsername", "Spardha-hash");
        model.addAttribute("gitHubRepo", "https://github.com/Spardha-hash/scm");
        return "home";
    }

    @RequestMapping("/about")
    public String aboutPage(){
        return "about";
    }

    @RequestMapping("/services")
    public String servicesPage(){
        return "services";
    }

    @RequestMapping("/contact")
    public String contactPage(){
        return "contact";
    }

    @RequestMapping("/login")
    public String loginPage(){
        return "login";
    }

    @RequestMapping("/register")
    public String registerPage(){
        return "register";
    }

}
