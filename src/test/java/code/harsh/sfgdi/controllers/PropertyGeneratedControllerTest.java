package code.harsh.sfgdi.controllers;

import code.harsh.sfgdi.controllers.PropertyGeneratedController;
import code.harsh.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyGeneratedControllerTest {

    PropertyGeneratedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyGeneratedController();
        controller.greetingService = new GreetingServiceImpl();
    }

    @Test
    void getGreeting() {
        assertEquals("Hello World", controller.getGreeting());
    }
}