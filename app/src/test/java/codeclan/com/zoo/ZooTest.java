package codeclan.com.zoo;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 10/11/2017.
 */

public class ZooTest {

    Zoo zoo;
    Enclosure<Lion> enclosureLion;
    Enclosure<Monkey> enclosureMonkey;
    Lion lion;
    Monkey monkey;

    @Before
    public void before() {
        zoo = new Zoo();
        enclosureLion = new Enclosure();
        enclosureMonkey = new Enclosure();
        lion = new Lion(1000);
        monkey = new Monkey(2000);
    }

    @Test
    public void testCanAddEnclosure() {
        zoo.addEnclosure(enclosureLion);
        zoo.addEnclosure(enclosureMonkey);
        assertEquals(2, zoo.getEnclosures().size());
    }

    @Test
    public void testCanRemoveEnclosure() {
        zoo.addEnclosure(enclosureLion);
        zoo.addEnclosure(enclosureMonkey);
        zoo.removeEnclosure(enclosureLion);
        assertEquals(1, zoo.getEnclosures().size());
    }

    @Test
    public void testGetTotalNumberOfAnimals() {
        zoo.addEnclosure(enclosureLion);
        zoo.addEnclosure(enclosureMonkey);
        enclosureLion.addAnimal(lion);
        enclosureMonkey.addAnimal(monkey);
        assertEquals(2, zoo.getTotalNumberOfAnimals());

    }

    @Test
    public void testCanSellAnimal() {
        zoo.addEnclosure(enclosureLion);
        enclosureLion.addAnimal(lion);
        zoo.sellAnimal(lion);
        assertEquals(0, enclosureLion.getNumberOfAnimals());
        assertEquals(1000, zoo.getCash());
    }
}
