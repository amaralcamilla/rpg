package characters;

import weapons.Weapon;
import weapons.WpBook;
import weapons.WpStaff;

public class CcSorcerer extends CombatClass {
	private final static int ATTACK = 33;
	private final static int DEFENSE = 23;
	private final static Weapon[] WEAPONS = {new WpStaff(), new WpBook()};	
	
	
	public CcSorcerer() {
		super(ATTACK, DEFENSE, WEAPONS);
	}
}
