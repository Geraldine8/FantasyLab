package Players.Mage;

import Behaviours.IDefend;
import Behaviours.ISpell;

public class Wizard extends Mage{
    public Wizard(int healthPoints, String name, IDefend defend, ISpell spell) {
        super(healthPoints, name, defend, spell);
    }
}
