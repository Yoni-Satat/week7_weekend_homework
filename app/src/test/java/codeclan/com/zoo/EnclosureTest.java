package codeclan.com.zoo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 10/11/2017.
 */

public class EnclosureTest {

    Enclosure<Lion> enclosureLion;
    Enclosure<Monkey> enclosureMonkey;
    Lion lion;
    Monkey monkey;

    @Before
    public void before() {
        enclosureLion = new Enclosure();
        enclosureMonkey = new Enclosure<>();
        lion = new Lion(1000);
        monkey = new Monkey(500);
    }

    @Test
    public void testCanAddAnimal() {
        enclosureLion.addAnimal(lion);
        assertEquals(1, enclosureLion.totalAmountOfAnimals());
    }

    @Test
    public void testCanRemoveAnimal() {
        enclosureLion.addAnimal(lion);
        enclosureLion.removeAnimal(lion);
        assertEquals(0, enclosureLion.totalAmountOfAnimals());
    }
}
