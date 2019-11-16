package Spells;

import Enemies.Enemy;
import Enemies.Orc;
import Spell.Fireball;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FireballTest {

    Fireball fireball;
    Enemy orc;

    @Before
    public void before(){
        fireball = new Fireball( 50);
        orc = new Orc(100);
    }

    @Test
    public void canCast(){
        fireball.cast(orc);
        assertEquals(50, orc.getHealthPoints());

    }

}
