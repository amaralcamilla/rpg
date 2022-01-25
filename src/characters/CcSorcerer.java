package characters;

import weapons.Weapon;
import weapons.WpBook;
import weapons.WpStaff;

public class CcSorcerer extends CombatClass {
	private final static int ATTACK = 50;
	private final static int DEFENSE = 30;
	private final static Weapon[] WEAPONS = {new WpStaff(), new WpBook()};	
	
	
	public CcSorcerer() {
		super(ATTACK, DEFENSE, WEAPONS);
	}
}
