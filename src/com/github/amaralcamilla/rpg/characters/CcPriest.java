package com.github.amaralcamilla.rpg.characters;

import com.github.amaralcamilla.rpg.weapons.Weapon;
import com.github.amaralcamilla.rpg.weapons.WpBook;
import com.github.amaralcamilla.rpg.weapons.WpClub;

public class CcPriest extends CombatClass {
	private final static int ATTACK = 21;
	private final static int DEFENSE = 21;
	private final static Weapon[] WEAPONS = {new WpClub(), new WpBook()};	
	
	
	public CcPriest() {
		super(ATTACK, DEFENSE, WEAPONS);
	}
}
