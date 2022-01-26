package com.github.amaralcamilla.rpg.characters;

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
		if (life < 0) {
			life = 0;
		}
		if (life > 100) {
			life = 100;
		}
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