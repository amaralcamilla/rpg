package com.github.amaralcamilla.rpg.characters;

public class Enemy {
	private int life, attack, defense, weaponDamage;

	public Enemy(int life, int attack, int defense, int weaponDamage) {
		this.life = life;
		this.attack = attack;
		this.defense = defense;
		this.weaponDamage = weaponDamage;
	}

	public int getLife() {
		return life;
	}
	
	public int setLife(int life) {
		return this.life = life;
	}

	public int getAttack() {
		return attack;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getWeaponDamage() {
		return weaponDamage;
	}
}