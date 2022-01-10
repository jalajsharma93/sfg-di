package guru.springframework.sfgdi.repositories;

public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {
    @Override
    public String getGreetings() {
        return  "Hello  - English EN In English Repository Impl";
    }
}
