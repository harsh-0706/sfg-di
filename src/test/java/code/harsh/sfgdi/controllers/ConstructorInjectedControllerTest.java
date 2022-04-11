package code.harsh.sfgdi.controllers;

import code.harsh.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {

        controller = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}