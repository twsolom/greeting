package com.cjb.greeting.rest;

import com.cjb.greeting.rest.controller.GreetingRestController;
import com.cjb.greeting.rest.model.Greeting;
import com.cjb.greeting.rest.service.GreetingService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Slf4j
public class GreetingRestAppContextIT {

    @LocalServerPort
    private int port;

    @Autowired
    private GreetingService greetingService;

    @Autowired
    private GreetingRestController greetingRestController;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testContextLoads() {
        log.info("Begin Testing Context loads");
        Assert.assertNotNull(greetingService);
        Assert.assertNotNull(greetingRestController);
        Assert.assertNotNull(restTemplate);
    }

    @Test
    public void testRestConroller() {
        String helloResponse = restTemplate.getForObject("http://localhost:" + port + "/hello",
        String.class);

        Assert.assertEquals(helloResponse, "hello world");
    }
}
