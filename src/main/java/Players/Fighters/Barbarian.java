package Players.Fighters;

import Behaviours.IWeapon;


public class Barbarian extends Fighter {

    private int strength;

    public Barbarian(int healthPoints, String name, IWeapon weapon, int strength) {
        super(healthPoints, name, weapon);
        this.strength = strength;
    }

    public int getStrength(){
        return this.strength;
    }

}
