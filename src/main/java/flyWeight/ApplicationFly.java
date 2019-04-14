package flyWeight;

import java.util.ArrayList;
import java.util.List;

public class ApplicationFly {
    public static void main(String[] args) {
        AnimalMaker animalMaker = new AnimalMaker();
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(animalMaker.getAnimal("Cat"));
        animals.add(animalMaker.getAnimal("Dog"));
        animals.add(animalMaker.getAnimal("Cat"));
        animals.add(animalMaker.getAnimal("Dog"));
        animals.add(animalMaker.getAnimal("Cat"));
        animals.add(animalMaker.getAnimal("Dog"));
        for (Animal animal : animals){
            System.out.println(animal.hashCode());
        }
    }

}
