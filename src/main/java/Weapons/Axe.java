package Weapons;

import Behaviours.IWeapon;
import Enemies.Enemy;

public class Axe implements IWeapon {
    public void attack(Enemy enemy) {
        enemy.takeDamage(10);
    }
}
