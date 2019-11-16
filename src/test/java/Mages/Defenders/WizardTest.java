package Mages.Defenders;

import Enemies.Enemy;
import Enemies.Troll;
import Players.Mage.Wizard;
import Spell.Fireball;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
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
        wizard = new Wizard(90, "Tom", dragon, fireball);
    }

    @Test
    public void hasName(){
        assertEquals("Tom", wizard.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(90, wizard.getHealthPoints());
    }

    @Test
    public void hasDefend(){
        wizard.defend(troll);
        assertEquals(50, troll.getHealthPoints());
    }

    @Test
    public void canSwapDefender(){
        wizard.setDefender(ogre);
        wizard.defend(troll);
        assertEquals(60, troll.getHealthPoints());
    }

    @Test
    public void hasSpell(){
        wizard.cast(troll);
        assertEquals(50, troll.getHealthPoints());
    }

    @Test
    public void SwapSpell(){
        wizard.setSpell(fireball);
        wizard.cast(troll);
        assertEquals(50, troll.getHealthPoints());
    }

}
