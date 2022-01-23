package scenes.combat;

import java.util.Scanner;

import entities.Enemy;
import entities.Player;

public class SceneCombat1 extends SceneCombat {

	public SceneCombat1(Scanner keyboard, Player player, Enemy enemy) {
		super(keyboard, player, enemy);

		System.out.println("texto combate 1");

		combatLoop();

	}

}
