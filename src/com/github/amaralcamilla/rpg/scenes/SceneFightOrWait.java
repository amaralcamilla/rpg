package com.github.amaralcamilla.rpg.scenes;

import java.util.Scanner;

import com.github.amaralcamilla.rpg.characters.Enemy;
import com.github.amaralcamilla.rpg.characters.Player;
import com.github.amaralcamilla.rpg.entities.Level;
import com.github.amaralcamilla.rpg.entities.Tools;

public class SceneFightOrWait extends SceneCombat {

	public SceneFightOrWait(Scanner keyboard, Player player, Enemy enemy, Level level) {
		super(keyboard, player, enemy, level);

		int selection;
		do {
			selection = Tools.getSelection(keyboard,"Vai ficar aí parado? O inimigo está se aproximando...\n1: Atacar!\n2: Esperar...", 1, 2);
		} while (selection != 1);

		combatLoop();
	}
}