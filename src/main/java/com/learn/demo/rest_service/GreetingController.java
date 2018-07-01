package com.learn.demo.rest_service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * TO-DO : What do we mean by @RestController annotation ?
 *
 * @RestController annotation -
 * which marks the class as a controller where
 * every method returns a domain object instead of a view.
 *
 */
@RestController
public class GreetingController {

    private static final String TEMPLATE = "Hello, %s!";

    private final AtomicLong counter = new AtomicLong();


    /*
     * TO-DO : What do we mean by @RequestMapping and @RequestParam annotation ?
     *
     * @RequestMapping annotation ensures that HTTP requests to /greeting are mapped to the greeting() method.
     */
    @RequestMapping(method = RequestMethod.GET, value = "/greetings")
    public Greeting greeting(@RequestParam(value = "name", defaultValue="World") String name) {


       /* The Greeting object must be converted to JSON.
        *
        * Thanks to Spring’s HTTP message converter support,
        * you don’t need to do this conversion manually.
        * Because Jackson 2 is on the classpath,
        * Spring’s MappingJackson2HttpMessageConverter
        * is automatically chosen to convert the Greeting instance to JSON.
        *
        */

        return new Greeting(counter.incrementAndGet(), String.format(TEMPLATE, name));
    }
}
