package scenes;

import java.util.Scanner;
import com.github.amaralcamilla.rpg.Parameters;
import characters.Player;

public class SceneFinalMessage extends Scene {

	public SceneFinalMessage(Scanner keyboard, Player player) {
		super(keyboard);

		System.out.println("\nVoc� conseguiu, " + player.getPlayerName() + "!\n");
		if (SceneMotivation.getMotivation() == Parameters.REVENGE) {
			System.out.println(
					"Voc� obteve sua vingan�a. Voc� se ajoelha e cai no choro, invadido por uma sensa��o de al�vio e felicidade. Voc� se vingou, tudo que sempre quis, est� feito. Agora  voc� pode seguir sua vida.\n");
		} else {
			System.out.println(
					"\nO �xtase em que voc� se encontra n�o cabe dentro de si. Voc� se ajoelha e grita de alegria. A gl�ria o aguarda, voc� a conquistou.\n");
		}

		System.out.println(
				"\nVoc� se levanta, olha para os prisioneiros, vai de um em um e os liberta, e todos voc�s saem em dire��o � noite, retornando � cidade. Seu dever est� cumprido.\n");
		return;
	}

}
