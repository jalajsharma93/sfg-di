package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		PetController petController = ctx.getBean("petController", PetController.class);
		System.out.println("--- The Best Pet is ---");
		System.out.println(petController.whichPetIsBest());

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println("____________Primary Bean");
		System.out.println(myController.sayHello());

		System.out.println("____________Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());


		System.out.println("____________Setter Injected");

		SetterInjectedController setterInjectedController = (SetterInjectedController)  ctx.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());


		System.out.println("____________Constructor  Injected");

		ConstructorInjectorController constructorInjectedController = (ConstructorInjectorController) ctx.getBean("constructorInjectorController");

		System.out.println(constructorInjectedController.getGreeting());

	}

}
