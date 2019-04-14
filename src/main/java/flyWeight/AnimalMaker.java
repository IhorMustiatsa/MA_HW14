package flyWeight;

import java.util.HashMap;
import java.util.Map;

public class AnimalMaker {
    private static final Map<String, Animal> animals = new HashMap<String, Animal>();
    public Animal getAnimal(String animal){
        Animal animal1 = animals.get(animal);
        if (animal1 == null){
            if (animal.equals("Cat")){
                animal1 = new Cat();
            }if (animal.equals("Dog")){
                animal1 = new Dog();
            }
            animals.put(animal, animal1);
        }
        return animal1;
    }
}
