package guru.springframwork.sfgdi.controllers;

import guru.springframwork.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;
/**
 * Created by Jalaj Sharma on 26/Dec/2021
 * */
@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){

        return greetingService.sayGreeting();
    }
}
