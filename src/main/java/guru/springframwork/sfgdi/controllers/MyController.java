package guru.springframwork.sfgdi.controllers;

import org.springframework.stereotype.Controller;
/**
 * Created by Jalaj Sharma on 26/Dec/2021
 * */
@Controller
public class MyController {

    public String sayHello(){

        System.out.println("Hello From Jalaj");
        return "Hola, Buenos Dias";
    }
}
