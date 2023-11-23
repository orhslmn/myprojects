package com.githubtest.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kullanici")

public class Controller {
@GetMapping("/kullanici")
    public String kullanici(){

    return "bu yeni";
}
}
