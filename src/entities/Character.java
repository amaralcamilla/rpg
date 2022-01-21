package entities;

import combatClass.CombatClass;

public class Character {
	private int life, weapon;
	private CombatClass combatClass;

	public Character(int life, CombatClass combatClass, int weapon) {
		this.life = life;
		this.combatClass = combatClass;
		this.weapon = weapon;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public CombatClass getCombatClass() {
		return combatClass;
	}

	public void setCombatClass(CombatClass combatClass) {
		this.combatClass = combatClass;
	}

	public int getWeapon() {
		return weapon;
	}

}
