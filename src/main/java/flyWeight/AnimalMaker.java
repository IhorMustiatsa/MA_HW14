package flyWeight;

import java.util.HashMap;
import java.util.Map;

public class AnimalMaker {
    private static final String CAT = "Cat";
    private static final String DOG = "Dog";

    private static final Map<String, Animal> animals = new HashMap<String, Animal>();
    public Animal getAnimal(String animal){
        Animal animal1 = animals.get(animal);
        if (animal1 == null){
            if (animal.equals(CAT)){
                animal1 = new Cat();
            }if (animal.equals(DOG)){
                animal1 = new Dog();
            }
            animals.put(animal, animal1);
        }
        return animal1;
    }
}
