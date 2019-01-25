package com.cjb.greeting.rest.config;

import com.cjb.greeting.rest.service.GreetingService;
import com.cjb.greeting.rest.service.GreetingServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingRestConfig {

    @Bean
    public GreetingService greetingService() {
        return new GreetingServiceImpl();
    }
}
