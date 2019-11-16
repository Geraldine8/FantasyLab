package Mages.Defenders;


import Enemies.Enemy;
import Enemies.Troll;
import Players.Mage.Warlock;
import Spell.Fireball;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock;
    Fireball fireball;
    Dragon dragon;
    Ogre ogre;
    Enemy troll;

    @Before
    public void before(){
        fireball = new Fireball(30);
        dragon = new Dragon(30);
        ogre = new Ogre (20);
        troll = new Troll(80);
        warlock = new Warlock(90, "Tom", dragon, fireball);
    }

    @Test
    public void hasName(){
        assertEquals("Tom", warlock.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(90, warlock.getHealthPoints());
    }

    @Test
    public void hasDefend(){
        warlock.defend(troll);
        assertEquals(50, troll.getHealthPoints());
    }

    @Test
    public void canSwapDefender(){
        warlock.setDefender(ogre);
        warlock.defend(troll);
        assertEquals(60, troll.getHealthPoints());
    }

    @Test
    public void hasSpell(){
        warlock.cast(troll);
        assertEquals(50, troll.getHealthPoints());
    }

    @Test
    public void SwapSpell(){
        warlock.setSpell(fireball);
        warlock.cast(troll);
        assertEquals(50, troll.getHealthPoints());
    }




}
