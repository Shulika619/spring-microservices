package dev.shulika.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class TestController {

    @Value("${eureka.instance.instanceId}")
    private String id;

    @Value("${tmpVar}")
    private String tmpVar;

    @GetMapping("/test")
    public String test(){
        return "test - Client1 :: id - " + id + " tempVar = " + tmpVar;
    }
}
