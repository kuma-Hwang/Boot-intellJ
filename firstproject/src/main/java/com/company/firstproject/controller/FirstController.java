package com.company.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hi") //URL 요청 접수
    public String niceToMeetYou(Model model) {
        model.addAttribute("username", "두드림");
        return "greetings";
    }

    @GetMapping("/bye") //URL 요청 접수
    public String seeYouNext(Model model) {
        model.addAttribute("username", "두드림");
        return "goodbye";
    }
}
