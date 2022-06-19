package com.sda.springdemojavaee14.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest//prepares all required beans for testing purposes
public class GreetingServiceTest {

    @Autowired // request to Spring for providing the bean, should be use only on tests!
    private GreetingService greetingService;

    @Test
    public void injectionTest(){
        Assertions.assertNotNull(greetingService, "Greeting service shouldn't be null!");
    }
}
