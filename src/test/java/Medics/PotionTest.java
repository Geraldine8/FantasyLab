package Medics;

import Healers.Potion;
import Players.Fighters.Knight;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PotionTest {

    Potion potion;
    Sword sword;
    Knight knight;

    @Before
    public void befoer(){
        potion = new Potion();
        sword = new Sword();
        knight = new Knight(40,"Lord Octavio", sword,30);
    }

    @Test
    public void canHeal(){
        potion.heal(knight);
        assertEquals(70, knight.getHealthPoints());
    }
}
