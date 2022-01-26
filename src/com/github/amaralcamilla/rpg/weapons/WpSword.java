package com.github.amaralcamilla.rpg.weapons;

public class WpSword extends Weapon {
	private final static int DAMAGE = 10;

	public WpSword() {
		super(DAMAGE);
	}

	@Override
	public String getWpComplement() {
		return "com sua espada";
	}
}