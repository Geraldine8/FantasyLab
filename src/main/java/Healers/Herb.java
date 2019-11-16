package Healers;

import Players.Player;

public class Herb {


    private int healValue;

    public Herb(){
        this.healValue = 10;
    }

    public void heal(Player player) {
        player.getHealth(this.healValue);
    }
}
