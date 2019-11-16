package Mages.Defenders;

import Enemies.Enemy;
import Enemies.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DragonTest {

    Dragon dragon;
    Enemy troll;

    @Before
    public void before(){
        dragon = new Dragon(50);
        troll = new Troll(70);
    }

    @Test
    public void canDefend(){
        dragon.defend(troll);
        assertEquals(20, troll.getHealthPoints());
    }

}
