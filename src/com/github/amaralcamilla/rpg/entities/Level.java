package com.github.amaralcamilla.rpg.entities;

public enum Level {
	EASY_LEVEL(1, 0.8), NORMAL_LEVEL(1, 1), HARD_LEVEL(0.9, 1);

	private double playerDamage, enemyDamage;

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