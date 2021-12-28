package guru.springframwork.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting(){
        return "Hello from Property Injected service";
    }
}
