package scenes.combat;

import java.util.Scanner;

import characters.Enemy;
import characters.Player;

public class SceneCombat1 extends SceneCombat {

	public SceneCombat1(Scanner keyboard, Player player, Enemy enemyGunsmith) {
		super(keyboard, player, enemy);

		combatLoop();
	}
}