package Spell;

import Behaviours.ISpell;
import Enemies.Enemy;

public class IceBlast implements ISpell {

    private int powerVol;;
    public IceBlast (int powerVol){
        this.powerVol = powerVol;
    }
    public void cast(Enemy enemy) {
        enemy.takeDamage(powerVol);

    }
}
