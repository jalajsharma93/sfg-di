package guru.springframework.pets;

public class CatPetService implements PetService{

    @Override
    public String getPetType() {
        return "Cat are the Best!";
    }
}
