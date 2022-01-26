package com.github.amaralcamilla.rpg.characters;

public class EnemyLeader extends Enemy {
	public final static int LIFE = 90;
	public final static int ATTACK = 35;
	public final static int DEFENSE = 35;
	public final static int WEAPON_DAMAGE = 20;

	public EnemyLeader() {
		super(LIFE, ATTACK, DEFENSE, WEAPON_DAMAGE);
	}
}