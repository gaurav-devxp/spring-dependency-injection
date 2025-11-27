package guru.springframework.spring7di.service.i18n;

import guru.springframework.spring7di.service.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"HI", "default"})
@Service("i18NService")
public class HindiGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "हिंदी सेवा से नमस्ते";
    }
}
