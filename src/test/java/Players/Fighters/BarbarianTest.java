package Players.Fighters;

import Behaviours.IWeapon;
import Enemies.Enemy;
import Enemies.Orc;
import Weapons.Axe;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {
    Barbarian barbarian;
    IWeapon axe;
    IWeapon sword;
    Enemy enemy;

    @Before
    public void before(){
        axe = new Axe();
        sword = new Sword();
        barbarian = new Barbarian(100, "Anna", axe,30);
        enemy = new Orc(100);
    }

    @Test
    public void hasHealthPoint(){
        assertEquals(100, barbarian.getHealthPoints());
    }

    @Test
    public void hasName(){
        assertEquals("Anna", barbarian.getName());
    }

    @Test
    public void hasStrength(){
        assertEquals(30, barbarian.getStrength());
    }

    @Test
    public void swapWeapon(){
        barbarian.setWeapon(sword);
        barbarian.attack(enemy);
        assertEquals(85, enemy.getHealthPoints());
    }

    @Test
    public void canTakeDamage(){
        barbarian.takeDamage(30);
        assertEquals(70, barbarian.getHealthPoints());
    }

    @Test
    public void attack(){
        barbarian.setWeapon(axe);
        barbarian.attack(enemy);
        assertEquals(90, enemy.getHealthPoints());
    }




}
