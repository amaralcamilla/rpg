package entities;

public enum Level {
	EASY_LEVEL(0.8), NORMAL_LEVEL(1.0), HARD_LEVEL(0.9);

	private double levelDamage;

	private Level(double levelDamage) {
		this.levelDamage = levelDamage;
	}

	public double getLevelDamage() {
		return levelDamage;
	}
}

// Fácil: inimigos causam -20% de dano ao player (ataque inimigo vale 80% de dano).
// Normal
// Difícil: player causa -10% de dano no inimigo (ataque do player vale 90% de dano).