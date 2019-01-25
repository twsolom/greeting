package com.cjb.greeting.rest.service;

import com.cjb.greeting.rest.model.Greeting;

import java.util.List;

public interface GreetingService {

    Greeting findById(String id);

    List<Greeting> findAllGreetings();

    void update(String id, Greeting greeting);

    void save(Greeting greeting);

    void remove(String id);
}
