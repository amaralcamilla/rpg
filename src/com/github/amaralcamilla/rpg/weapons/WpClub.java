package com.github.amaralcamilla.rpg.weapons;

public class WpClub extends Weapon {
	private final static int DAMAGE = 13;

	public WpClub() {
		super(DAMAGE);
	}

	@Override
	public String getWpComplement() {
		return "com sua clava";
	}
}