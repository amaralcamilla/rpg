package com.github.amaralcamilla.rpg.characters;

import com.github.amaralcamilla.rpg.weapons.Weapon;
import com.github.amaralcamilla.rpg.weapons.WpHammer;
import com.github.amaralcamilla.rpg.weapons.WpSword;
import com.github.amaralcamilla.rpg.weapons.WpAxe;

public class CcWarrior extends CombatClass {
	private final static int ATTACK = 20;
	private final static int DEFENSE = 20;
	private final static Weapon[] WEAPONS = {new WpSword(), new WpHammer(), new WpAxe()};	
	
	public CcWarrior() {
		super(ATTACK, DEFENSE, WEAPONS);
	}
}