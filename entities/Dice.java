package entities;

import java.util.Random;

public abstract class Dice {
	private Random random;
	private int maxDiceValue;
	
	public Dice(int maxDiceValue) {
		this.maxDiceValue = maxDiceValue;
	}

	public int getMaxDiceValue() {
		return maxDiceValue;
	}
	
	public int rollDice() {
		return random.nextInt(maxDiceValue) + 1;
	}
}
