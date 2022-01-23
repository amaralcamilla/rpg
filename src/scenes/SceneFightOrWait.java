package scenes;

import java.util.Scanner;
import com.github.amaralcamilla.rpg.Parameters;

public class SceneFightOrWait extends Scene {
	private int fightOrWait;

	public SceneFightOrWait(Scanner keyboard) {
		super(keyboard);
		
		System.out.println("1: Atacar");
		System.out.println("2: Esperar");

		fightOrWait = keyboard.nextInt();

		if (fightOrWait == Parameters.POSITIVE_ANSWER) {

			// TODO loop de combate - verifique se teve vitoria de alguem

		}
		while (fightOrWait == Parameters.NEGATIVE_ANSWER) {
			System.out.printf("%nVai ficar aí parado? O inimigo está se aproximando...%n");
			System.out.println("1: Atacar");
			System.out.println("2: Esperar");
		}

		fightOrWait = keyboard.nextInt();

	}
}
