package com.vikash.jwt;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String message(){

        return "Hello";
    }

    @RequestMapping("/helloworld")
    public String messageWorld(){

        return "helloworld";
    }

}
