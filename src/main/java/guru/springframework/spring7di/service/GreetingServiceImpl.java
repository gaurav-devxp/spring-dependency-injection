package guru.springframework.spring7di.service;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello from the base service !!";
    }
}
