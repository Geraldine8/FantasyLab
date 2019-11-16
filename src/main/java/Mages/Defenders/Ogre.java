package Mages.Defenders;

import Behaviours.IDefend;
import Enemies.Enemy;

public class Ogre implements IDefend {


    private int damageValue;
    public Ogre (int damageValue){
        this.damageValue =  damageValue;
    }

    public void defend(Enemy enemy) {
        enemy.takeDamage(damageValue);

    }


}
