package guru.springframework.pets;

public class DogPetService implements PetService{
    @Override
    public String getPetType() {
        return "Dog are the Best";
    }
}
