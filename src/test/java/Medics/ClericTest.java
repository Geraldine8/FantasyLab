package Medics;

import Behaviours.IWeapon;
import Healers.Herb;
import Healers.Potion;
import Medic.Cleric;
import Players.Fighters.Knight;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {
    Cleric cleric;
    Potion potion;
    IWeapon sword;
    Knight knight;

    @Before
    public void before(){
        sword = new Sword();
        knight = new Knight(30,"Lord Octavio", sword,30);
        potion = new Potion();
        cleric = new Cleric(70, "Dr. who", potion);

    }

    @Test
    public void canHeal(){
        cleric.heal(knight);
        assertEquals(60, knight.getHealthPoints());
    }
}
