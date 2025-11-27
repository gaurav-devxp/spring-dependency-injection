package guru.springframework.spring7di.service.i18n;

import guru.springframework.spring7di.service.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18NService")
public class EnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello from the English service";
    }
}
