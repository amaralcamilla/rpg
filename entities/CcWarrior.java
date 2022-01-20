package entities;

public class CcWarrior extends CombatClass {
	private final static int ATTACK = 10;
	private final static int DEFFENSE = 10;
	private final static Weapon[] WEAPONS = {new WpSword(), new WpHammer(), new WpAxe()};	
	
	
	public CcWarrior() {
		super(ATTACK, DEFFENSE, WEAPONS);
	}
}

