package Players.Mage;

import Behaviours.IDefend;
import Behaviours.ISpell;
import Enemies.Enemy;
import Players.Player;

public class Mage extends Player {
    IDefend defend;
    ISpell spell;
    public Mage(int healthPoints, String name, IDefend defend, ISpell spell) {
        super(healthPoints, name);
        this.defend = defend;
        this.spell = spell;

    }

    public void setDefender(IDefend defender){
        this.defend = defender;
    }

    public void setSpell(ISpell cast){
        this.spell = spell;
    }

    public void defend (Enemy enemy) {
        this.defend.defend(enemy);
    }

    public void cast (Enemy enemy) {
        this.spell.cast(enemy);
    }
}
