package Mages.Defenders;

import Behaviours.IDefend;
import Enemies.Enemy;

public class Dragon implements IDefend {

    private int damageValue;
    public Dragon(int damageValue){
        this.damageValue =  damageValue;
    }

    public void defend(Enemy enemy) {
        enemy.takeDamage(damageValue);

    }
}
