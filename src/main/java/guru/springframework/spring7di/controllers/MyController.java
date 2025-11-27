package guru.springframework.spring7di.controllers;

import guru.springframework.spring7di.service.GreetingService;
import guru.springframework.spring7di.service.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

/**
 * Created by jt, Spring Framework Guru.
 */
@Controller
public class MyController {
    private final GreetingService greetingService;

    // Without Dependency Injection
    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello(){
        System.out.println("I'm in the controller");

        return greetingService.sayGreeting();
    }
}
