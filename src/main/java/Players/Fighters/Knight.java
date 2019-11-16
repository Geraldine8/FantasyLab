package Players.Fighters;

import Behaviours.IWeapon;


public class Knight extends Fighter{

    private int armour;

    public Knight(int healthPoints, String name, IWeapon weapon, int armour) {
        super(healthPoints, name, weapon);
        this.armour = armour;
    }

    public int getAmour(){
      return this.armour;
    }

    public void takeDamage(int damage) {
        if(damage < this.armour){
            super.takeDamage((int)(damage / 2));
        } else {
            super.takeDamage(damage - this.armour);
        }

    }

}
