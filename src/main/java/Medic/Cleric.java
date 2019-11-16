package Medic;

import Behaviours.IHeal;
import Players.Player;

public class Cleric extends Player {
    IHeal medicine;
    public Cleric(int healthPoints, String name, IHeal medicine) {
        super(healthPoints, name);
        this.medicine = medicine;
    }

    public void setMedicine(IHeal medicine){
       this.medicine = medicine;
    }

    public void heal(Player player){
        this.medicine.heal(player);
    }
}
