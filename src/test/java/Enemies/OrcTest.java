package Enemies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrcTest {

    Orc orc;

    @Before
    public void before(){
        orc = new Orc(100);
    }

    @Test
    public void attack(){
        orc.takeDamage(60);
        assertEquals(40, orc.getHealthPoints());
    }
}
