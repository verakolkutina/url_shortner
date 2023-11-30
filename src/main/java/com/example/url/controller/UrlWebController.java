package com.example.url.controller;


import com.example.url.model.UrlDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UrlWebController {

    @GetMapping("/url-shortener")
    public String showUrlShortenerPage(Model model) {
        model.addAttribute("urlDto", new UrlDto());
        return "generate";
    }
}


