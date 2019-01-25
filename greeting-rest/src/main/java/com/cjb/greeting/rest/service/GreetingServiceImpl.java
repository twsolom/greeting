package com.cjb.greeting.rest.service;

import com.cjb.greeting.rest.model.Greeting;

import java.util.List;

public class GreetingServiceImpl implements GreetingService {

    @Override
    public Greeting findById(String id) {
        Greeting greeting = new Greeting();
        greeting.setId("123");
        greeting.setAuthor("chris");
        greeting.setMessage("Hello Greeting");
        return greeting;
    }

    @Override
    public List<Greeting> findAllGreetings() {
        return null;
    }

    @Override
    public void update(String id, Greeting greeting) {

    }

    @Override
    public void save(Greeting greeting) {

    }

    @Override
    public void remove(String id) {

    }
}
