package entities;

public class CcSorcerer extends CombatClass {
	private final static int ATTACK = 10;
	private final static int DEFENSE = 10;
	private final static Weapon[] WEAPONS = {new WpStaff(), new WpBook()};	
	
	
	public CcSorcerer() {
		super(ATTACK, DEFENSE, WEAPONS);
	}
}
