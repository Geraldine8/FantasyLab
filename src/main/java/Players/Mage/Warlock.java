package Players.Mage;

import Behaviours.IDefend;
import Behaviours.ISpell;

public class Warlock extends Mage {
    public Warlock(int healthPoints, String name, IDefend defend, ISpell spell) {
        super(healthPoints, name, defend, spell);
    }
}
