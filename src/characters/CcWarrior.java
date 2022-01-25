package characters;

import weapons.Weapon;
import weapons.WpAxe;
import weapons.WpHammer;
import weapons.WpSword;

public class CcWarrior extends CombatClass {
	private final static int ATTACK = 40;
	private final static int DEFENSE = 60;
	private final static Weapon[] WEAPONS = {new WpSword(), new WpHammer(), new WpAxe()};	
	
	
	public CcWarrior() {
		super(ATTACK, DEFENSE, WEAPONS);
	}
}

