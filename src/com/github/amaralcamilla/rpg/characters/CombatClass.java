package com.github.amaralcamilla.rpg.characters;

import com.github.amaralcamilla.rpg.weapons.Weapon;

public abstract class CombatClass {
	private int attack;
	private int defense;
	private Weapon[] weapons;
	private int selectedWeapon;

	public CombatClass(int attack, int defense, Weapon[] weapons) {
		this.attack = attack;
		this.defense = defense;
		this.weapons = weapons;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int i) {
		this.attack = i;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int i) {
		this.defense = i;
	}

	public Weapon getWeapon() {
		return weapons[selectedWeapon];
	}

	public int getSelectedWeapon() {
		return selectedWeapon;
	}

	public void setSelectedWeapon(int selectedWeapon) {
		this.selectedWeapon = selectedWeapon;
	}
}