package com.github.amaralcamilla.rpg.characters;

import com.github.amaralcamilla.rpg.weapons.Weapon;
import com.github.amaralcamilla.rpg.weapons.WpBowAndArrow;
import com.github.amaralcamilla.rpg.weapons.WpCrossbowAndBolt;

public class CcHunter extends CombatClass {
	private final static int ATTACK = 22;
	private final static int DEFENSE = 22;
	private final static Weapon[] WEAPONS = {new WpBowAndArrow(), new WpCrossbowAndBolt()};	
	
	public CcHunter() {
		super(ATTACK, DEFENSE, WEAPONS);
	}
}