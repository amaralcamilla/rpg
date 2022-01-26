package com.github.amaralcamilla.rpg.weapons;

public class WpBook extends Weapon {
	private final static int DAMAGE = 12;
		
	public WpBook() {
		super(DAMAGE);
	}
	
	@Override
	public String getWpComplement() {
		return "absorvendo energia do livro com uma m�o e liberando com a outra";
	}
}
