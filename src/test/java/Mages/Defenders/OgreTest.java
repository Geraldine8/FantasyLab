package Mages.Defenders;

import Enemies.Enemy;
import Enemies.Orc;
//import Spell.Ogre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OgreTest {
    Ogre ogre;
    Enemy orc;

    @Before
    public void before() {
        ogre = new Ogre(50);
        orc = new Orc(80);
    }

    @Test
    public void canDefend() {
        ogre.defend(orc);
        assertEquals(30, orc.getHealthPoints());
    }
}
