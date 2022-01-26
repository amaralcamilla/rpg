package com.github.amaralcamilla.rpg.weapons;

public class WpStaff extends Weapon {
private final static int DAMAGE = 20;
		
	
	public WpStaff() {
		super(DAMAGE);
	}
	
	@Override
	public String getWpComplement() {
		return "com seu cajado, lançando uma bola de fogo";
	}
}
