package codeclan.com.zoo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 10/11/2017.
 */

public class LionTest {

    Lion lion;

    @Before
    public void before() {
        lion = new Lion(1000);
    }

    @Test
    public void testGetCashValue() {
        assertEquals(1000, lion.getCashValue());
    }
}
