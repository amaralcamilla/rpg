package com.github.amaralcamilla.rpg.weapons;

public class WpHammer extends Weapon {
	private final static int DAMAGE = 12;

	public WpHammer() {
		super(DAMAGE);
	}

	@Override
	public String getWpComplement() {
		return "com seu martelo";
	}
}