package guru.springframework.spring7di.controllers;

import guru.springframework.spring7di.service.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectorControllerTest {
    PropertyInjectorController  propertyInjectorController;

    @BeforeEach
    void setUp() {
        propertyInjectorController = new PropertyInjectorController();
        propertyInjectorController.greetingService = new GreetingServiceImpl();
    }

    @Test
    void sayHello() {
        System.out.println(propertyInjectorController.sayHello());
    }
}