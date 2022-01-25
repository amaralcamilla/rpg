package scenes;

import java.util.Scanner;
import com.github.amaralcamilla.rpg.Parameters;
import com.github.amaralcamilla.rpg.Tools;

public class SceneFightOrWait extends Scene {
	private int fightOrWait;

	public SceneFightOrWait(Scanner keyboard) {
		super(keyboard);

		fightOrWait = Tools.getSelection(keyboard, "1: Atacar!\n2: Esperar...", 1, 2);

		if (fightOrWait == Parameters.POSITIVE_ANSWER) {

			// TODO loop de combate - verifique se teve vitoria de alguem

		}
		while (fightOrWait == Parameters.NEGATIVE_ANSWER) {
			System.out.println("\nVai ficar aí parado? O inimigo está se aproximando...\n");
			System.out.println("1: Atacar");
			System.out.println("2: Esperar");
		}

		fightOrWait = keyboard.nextInt();
	}
}
