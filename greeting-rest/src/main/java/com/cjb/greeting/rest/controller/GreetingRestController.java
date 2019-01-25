package com.cjb.greeting.rest.controller;

import com.cjb.greeting.rest.model.Greeting;
import com.cjb.greeting.rest.service.GreetingService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingRestController {

    private GreetingService greetingService;

    public GreetingRestController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "hello world";
    }

    @RequestMapping(value = "/greeting/{id}", method = RequestMethod.GET)
    public Greeting findGreetingById(@PathVariable String id) {
        return greetingService.findById(id);
    }

}
