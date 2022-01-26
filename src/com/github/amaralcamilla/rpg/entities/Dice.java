package com.github.amaralcamilla.rpg.entities;

import java.util.Random;

public class Dice {
	private Random random = new Random();
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