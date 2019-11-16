package Players.Fighters;

import Behaviours.IWeapon;
import Enemies.Enemy;
import Enemies.Troll;
import Weapons.Club;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;
    IWeapon sword;
    IWeapon club;

    Enemy enemy;



    @Before
    public void before(){
        sword = new Sword();
        club = new Club();
        dwarf = new Dwarf(100, "Enano", club, 50 );
        enemy = new Troll(100);
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(100, dwarf.getHealthPoints());
    }

    @Test
    public void hasName(){
        assertEquals("Enano", dwarf.getName());
    }

    @Test
    public void hasSped(){
        assertEquals(50, dwarf.getSpeed());
    }

    @Test
    public void swapWeapon(){
        dwarf.setWeapon(sword);
        dwarf.attack(enemy);
        dwarf.attack(enemy);
        dwarf.attack(enemy);
        dwarf.attack(enemy);
        assertEquals(40, enemy.getHealthPoints());
    }


    @Test
    public void TakeDamage(){
        dwarf.takeDamage(50);
        assertEquals(50, dwarf.getHealthPoints());
    }

    @Test
    public void attack(){
        dwarf.setWeapon(club);
        dwarf.attack(enemy);
        dwarf.attack(enemy);
        dwarf.attack(enemy);
        dwarf.attack(enemy);
        assertEquals(80, enemy.getHealthPoints());
    }



}
