package Spell;

import Behaviours.ISpell;
import Enemies.Enemy;

public class Fireball implements ISpell {

    private int powervol;
    public Fireball(int powervol){
        this.powervol = powervol;
    }

    public void cast(Enemy enemy) {
        enemy.takeDamage(powervol);
    }
}
