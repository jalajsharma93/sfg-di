package guru.springframework.sfgdi.services;

public class PropertyInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting(){
        return "Hello from Property Injected service:Java Config EX";
    }
}
