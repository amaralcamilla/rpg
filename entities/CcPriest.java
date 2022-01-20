package entities;

public class CcPriest extends CombatClass {
	private final static int ATTACK = 10;
	private final static int DEFENSE = 10;
	private final static Weapon[] WEAPONS = {new WpClub(), new WpBook()};	
	
	
	public CcPriest() {
		super(ATTACK, DEFENSE, WEAPONS);
	}
}
