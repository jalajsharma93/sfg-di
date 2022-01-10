package guru.springframework.sfgdi.config;


import guru.springframework.pets.PetService;
import guru.springframework.pets.PetServiceFactory;
import guru.springframework.sfgdi.repositories.EnglishGreetingRepository;
import guru.springframework.sfgdi.repositories.EnglishGreetingRepositoryImpl;
import guru.springframework.sfgdi.services.*;
import org.springframework.context.annotation.*;

@ImportResource("classpath:sfgdi-config.xml")
@Configuration
public class GreetingServiceConfig {


    @Bean
    PetServiceFactory petServiceFactory(){
        return new PetServiceFactory();
    }
    @Bean
    @Profile({"dog","default"})
    PetService dogPetService(PetServiceFactory petServiceFactory){
        return petServiceFactory.getPetService("dog");
    }

    @Bean
    @Profile({"cat"})
    PetService catPetService(PetServiceFactory petServiceFactory){
        return petServiceFactory.getPetService("cat");
    }


    @Profile({"ES","default"})
    @Bean("i18nService")
    I18SpanishService i18SpanishService(){
        return new I18SpanishService();
    }
    @Bean
    EnglishGreetingRepository englishGreetingRepository() {
        return new EnglishGreetingRepositoryImpl();
    }

    @Profile("EN")
    @Bean
    I18nEnglishGreetingService i18nService(EnglishGreetingRepository englishGreetingRepository){
        return new I18nEnglishGreetingService(englishGreetingRepository);
    }

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService(){
        return new PrimaryGreetingService();
    }


    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService(){
        return new PropertyInjectedGreetingService();
    }
    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService(){
        return new SetterInjectedGreetingService();
    }
}