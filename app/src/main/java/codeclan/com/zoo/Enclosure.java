package codeclan.com.zoo;

import java.util.ArrayList;

/**
 * Created by user on 10/11/2017.
 */

public class Enclosure<T extends Animal> {

    private ArrayList<T> animals;

    public Enclosure() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(T animal) {
        animals.add(animal);
    }

    public int totalAmountOfAnimals() {
        return animals.size();
    }

    public void removeAnimal(T animal) {
        animals.remove(animal);
    }

    public int getNumberOfAnimals() {
        return animals.size();
    }

    public boolean containsAnimal(Animal animal) {
        return animals.contains(animal);
    }
}
