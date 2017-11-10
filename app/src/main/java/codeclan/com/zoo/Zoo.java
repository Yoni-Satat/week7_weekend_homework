package codeclan.com.zoo;

import java.util.ArrayList;

/**
 * Created by user on 10/11/2017.
 */

public class Zoo {

    private ArrayList<Enclosure> enclosures;
    private int cash;

    public Zoo() {
        this.enclosures = new ArrayList<>();
        this.cash = 0;
    }

    public ArrayList getEnclosures() {
        return this.enclosures;
    }

    public void addEnclosure(Enclosure enclosure) {
        enclosures.add(enclosure);
    }

    public void removeEnclosure(Enclosure enclosure) {
        enclosures.remove(enclosure);
    }

    public int getTotalNumberOfAnimals() {
        int total = 0;
        for(Enclosure enclosure : enclosures) {
            total += enclosure.getNumberOfAnimals();
        }
        return total;
    }

    public int getCash() {
        return cash;
    }

    public void sellAnimal(Animal animal) {
        // find enclosure contains animal
        for (Enclosure enclosure : enclosures) {
            if(enclosure.containsAnimal(animal)) {
                // remove animal from enclosure
                enclosure.removeAnimal(animal);
                // add cashValue to cash
                this.cash += animal.getCashValue();
            }
        }

    }
}
