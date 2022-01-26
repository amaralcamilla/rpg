package com.github.amaralcamilla.rpg.characters;

public class EnemyGunsmith extends Enemy {
	public final static int LIFE = 70;
	public final static int ATTACK = 20;
	public final static int DEFENSE = 20;
	public final static int WEAPON_DAMAGE = 10;

	public EnemyGunsmith() {
		super(LIFE, ATTACK, DEFENSE, WEAPON_DAMAGE);
	}
}