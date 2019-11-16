package Enemies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrollTest {

    Troll troll;

    @Before
    public void before() {
        troll = new Troll(100);
    }

    @Test
    public void canTakeDamage() {
        troll.takeDamage(50);
        assertEquals(50, troll.getHealthPoints());
    }

}
