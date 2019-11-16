package Healers;

import Behaviours.IHeal;
import Players.Player;

public class Potion implements IHeal {

    private int healValue;

    public Potion(){
        this.healValue = 30;
    }

    public void heal(Player player) {
        player.getHealth(this.healValue);
    }
}
