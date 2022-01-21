package entities;

import java.util.Random;

public abstract class Dice {
	private Random random;
	private int maxDiceValue;
	
	public Dice(Random random, int maxDiceValue) {
		this.random = random;
		this.maxDiceValue = maxDiceValue;
	}

	public int getMaxDiceValue() {
		return maxDiceValue;
	}
	
	public int rollDice() {
		return random.nextInt(maxDiceValue) + 1;
	}
}
