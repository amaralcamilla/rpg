package com.github.amaralcamilla.rpg.weapons;

public class WpCrossbowAndBolt extends Weapon {
private final static int DAMAGE = 9;
	
	public WpCrossbowAndBolt() {
		super(DAMAGE);
	}
	
	@Override
	public String getWpComplement() {
		return "com sua besta, o virote atingiu";
	}
}
