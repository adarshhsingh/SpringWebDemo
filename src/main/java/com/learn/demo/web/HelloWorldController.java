package com.learn.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * TO-DO : What do we mean by @RestController annotation ?
 */
@RestController
public class HelloWorldController {

    /*
     * TO-DO : What do we mean by @RequestMapping and @RequestParam annotation ?
     */
    @RequestMapping("/hello")
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello "+ name + "!";
    }
}
