package characters;

import weapons.Weapon;
import weapons.WpBowAndArrow;
import weapons.WpCrossbowAndBolt;

public class CcHunter extends CombatClass {
	private final static int ATTACK = 10;
	private final static int DEFENSE = 20;
	private final static Weapon[] WEAPONS = {new WpBowAndArrow(), new WpCrossbowAndBolt()};	
	
	
	public CcHunter() {
		super(ATTACK, DEFENSE, WEAPONS);
	}
}
