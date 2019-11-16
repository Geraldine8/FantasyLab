package Players.Fighters;

import Behaviours.IWeapon;

public class Dwarf extends Fighter {
    private IWeapon weapon;
    private int speed;

    public Dwarf(int healthPoints, String name, IWeapon weapon, int speed) {
        super(healthPoints, name, weapon);
        this.speed = speed;
    }

    public int getSpeed(){
        return this.speed;
    }




}
