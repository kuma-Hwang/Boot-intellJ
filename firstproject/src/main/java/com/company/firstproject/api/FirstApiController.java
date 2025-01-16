package com.company.firstproject.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //REST API용 컨드롤러
public class FirstApiController {
    @GetMapping("/api/hello")
    public String hello() {
        return "hello world!";
    }

}
