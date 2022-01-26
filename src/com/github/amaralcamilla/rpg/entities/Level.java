package com.github.amaralcamilla.rpg.entities;

public enum Level {
	EASY_LEVEL(1, 0.8), NORMAL_LEVEL(1, 1), HARD_LEVEL(0.9, 1);
	
	private double playerDamage;
	private double enemyDamage;

	private Level(double playerDamage, double enemyDamage) {
		this.playerDamage = playerDamage;
		this.enemyDamage = enemyDamage;
	}

	public double getPlayerDamage() {
		return playerDamage;
	}

	public double getEnemyDamage() {
		return enemyDamage;
	}


}

// Fácil: inimigos causam -20% de dano ao player (ataque inimigo vale 80% de dano).
// Normal
// Difícil: player causa -10% de dano no inimigo (ataque do player vale 90% de dano).
// dano * level