package guru.springframework.spring7di.controllers;

import guru.springframework.spring7di.service.GreetingService;

public class PropertyInjectorController {
    GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
