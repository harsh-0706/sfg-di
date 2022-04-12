package code.harsh.sfgdi.controllers;

import code.harsh.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new ConstructorGreetingService());
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}