package Players.Fighters;

import Behaviours.IWeapon;
import Enemies.Enemy;
import Players.Player;

public abstract class Fighter extends Player {

    private IWeapon weapon;

    public Fighter(int healthPoints, String name, IWeapon weapon) {
        super(healthPoints, name);
        this.weapon = weapon;
    }

    public void setWeapon(IWeapon weapon){
        this.weapon = weapon;
    }

    public void attack(Enemy enemy){
        this.weapon.attack(enemy);
    }


}
