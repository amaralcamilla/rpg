package entities;

public abstract class CombatClass {
	private int attack;
	private int defense;
	private Weapon[] weapons;
	
	public CombatClass(int attack, int defense, Weapon[] weapons) {
		this.attack = attack;
		this.defense = defense;
		this.weapons = weapons;
	}

	public int getAttack() {
		return attack;
	}

	public int getDefense() {
		return defense;
	}

	public Weapon[] getWeapons() {
		return weapons;
	}
	
}
