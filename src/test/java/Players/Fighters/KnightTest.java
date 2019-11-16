package Players.Fighters;

import Enemies.Enemy;
import Enemies.Orc;
import Weapons.Axe;
import Weapons.Club;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {
    private Knight knight;
    private Sword sword;
    private Axe axe;
    private Club club;
    private Enemy enemy;


    @Before
    public void before(){
        sword = new Sword();
        axe = new Axe();
        club = new Club();
        knight = new Knight(100, "Octavio", sword, 30);
        enemy = new Orc(80);
    }


    @Test
    public void hasHealthPoints(){
        assertEquals(100, knight.getHealthPoints());
    }

    @Test
    public void hasName(){
        assertEquals("Octavio", knight.getName());
    }

    @Test
    public void swapWeapon(){
        knight.setWeapon(axe);
        knight.attack(enemy);
        knight.attack(enemy);
        knight.attack(enemy);
        knight.attack(enemy);
        assertEquals(40, enemy.getHealthPoints());
    }

    @Test
    public void attack(){
        knight.setWeapon(axe);
        knight.attack(enemy);
        assertEquals(70, enemy.getHealthPoints());
    }

    @Test
    public void takeDamage(){
        knight.takeDamage(70);
        assertEquals(60, knight.getHealthPoints());
    }



    @Test
    public void reduceDamage(){
        knight.takeDamage(50);
        assertEquals(80, knight.getHealthPoints());
    }

    @Test
    public void reduceDamageLowerAttack(){
        knight.takeDamage(25);
        assertEquals(88, knight.getHealthPoints());
    }


}
