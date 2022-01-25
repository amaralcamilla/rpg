package scenes;

import java.util.Scanner;
import com.github.amaralcamilla.rpg.Parameters;
import com.github.amaralcamilla.rpg.Tools;

public class SceneGoAhead extends Scene {
	private static int decisionResult;

	public SceneGoAhead(Scanner keyboard) {
		super(keyboard); 

		decisionResult = Tools.getSelection(keyboard,
				"\nVocê só pode ir à frente, ou desistir.\n1: Seguir em frente!\n2: Desistir.", 1, 2);

		if (decisionResult == Parameters.GO_AHEAD) {
			System.out.println(
					"\nVocê caminha, atento a todos os seus sentidos, por vários metros, até visualizar a frente uma fonte de luz, que você imagina ser a chama de uma tocha, vindo de dentro de uma porta aberta.\n");
		} else {
			System.out.println(
					"\nO medo invade o seu coração e você sente que ainda não está à altura do desafio. Você se volta para a noite lá fora e corre em direção à segurança.\n");
			return;

		}
	}

	public int getResult() {
		return decisionResult;
	}
}
