package Spells;

import Enemies.Enemy;
import Enemies.Troll;
import Spell.IceBlast;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceBlastTest {

    IceBlast iceBlast;
    Enemy troll;

    @Before
    public void before(){
        iceBlast = new IceBlast(70);
        troll = new Troll(90);
    }
    @Test
    public void canCast(){
        iceBlast.cast(troll);
        assertEquals(20, troll.getHealthPoints());
    }
}
