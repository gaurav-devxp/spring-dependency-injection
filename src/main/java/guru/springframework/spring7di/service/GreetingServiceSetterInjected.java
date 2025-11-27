package guru.springframework.spring7di.service;

import org.springframework.stereotype.Service;

@Service("setterGreetingBean")
public class GreetingServiceSetterInjected implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello from the setter injected greeting service";
    }
}
