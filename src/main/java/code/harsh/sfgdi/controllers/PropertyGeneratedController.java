package code.harsh.sfgdi.controllers;

import code.harsh.sfgdi.services.GreetingService;

public class PropertyGeneratedController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
