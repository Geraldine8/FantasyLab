package Medics;

import Healers.Herb;
import Players.Fighters.Knight;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HerbTest {

    Herb herb;
    Sword sword;
    Knight knight;

    @Before
    public void before(){
        herb = new Herb();
        sword = new Sword();
        knight = new Knight(30,"Lord Octavio", sword,30);
    }

    @Test
    public void canHeal(){
        herb.heal(knight);
        assertEquals(40, knight.getHealthPoints());
    }
}
