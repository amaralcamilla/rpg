package scenes.combat;

import java.util.Scanner;
import com.github.amaralcamilla.rpg.Tools;
import characters.Enemy;
import characters.Player;
import entities.Level;

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