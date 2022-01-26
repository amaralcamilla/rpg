package com.github.amaralcamilla.rpg.characters;

import com.github.amaralcamilla.rpg.weapons.Weapon;
import com.github.amaralcamilla.rpg.weapons.WpBook;
import com.github.amaralcamilla.rpg.weapons.WpStaff;

public class CcSorcerer extends CombatClass {
	private final static int ATTACK = 33;
	private final static int DEFENSE = 23;
	private final static Weapon[] WEAPONS = {new WpStaff(), new WpBook()};	
	
	
	public CcSorcerer() {
		super(ATTACK, DEFENSE, WEAPONS);
	}
}
