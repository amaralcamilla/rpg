package scenes;

import java.util.Scanner;
import com.github.amaralcamilla.rpg.Parameters;

public class SceneGoAhead extends Scene {

	public SceneGoAhead(Scanner keyboard) {
		super(keyboard);

		System.out.printf("%nVocê só pode ir à frente, ou desistir.%n");
		System.out.println("1: Seguir em frente!");
		System.out.println("2: Desistir.");

		int goAhead = keyboard.nextInt();

		if (goAhead == Parameters.GO_AHEAD) {
			System.out.printf("%nVocê caminha, atento a todos os seus sentidos, por vários metros, até visualizar a frente uma fonte de luz, que você imagina ser a chama de uma tocha, vindo de dentro de uma porta aberta.%n");
		} else if (goAhead == Parameters.RUNAWAY) {
			System.out.printf("%nO medo invade o seu coração e você sente que ainda não está à altura do desafio. Você se volta para a noite lá fora e corre em direção à segurança.%n");
			return;

		} else {
			System.out.printf("%nDigite uma opção válida.%n");
		}

	}

}
