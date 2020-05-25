package com.codenext.awselastic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aws")
public class HelloController {
    @GetMapping("/")
    public String getHelloWorld(){
        return "The demo of hello world";
    }
}