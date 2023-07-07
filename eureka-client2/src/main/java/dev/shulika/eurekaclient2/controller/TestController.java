package dev.shulika.eurekaclient2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class TestController {
    @GetMapping("/test2")
    public String test2(){
        return "test2 - Client2";
    }
}
