package scenes;

import java.util.Scanner;
import com.github.amaralcamilla.rpg.Parameters;

public class SceneGoAhead extends Scene {

	public SceneGoAhead(Scanner keyboard) {
		super(keyboard);

		System.out.printf("%nVoc� s� pode ir � frente, ou desistir.%n");
		System.out.println("1: Seguir em frente!");
		System.out.println("2: Desistir.");

		int goAhead = keyboard.nextInt();

		if (goAhead == Parameters.GO_AHEAD) {
			System.out.printf("%nVoc� caminha, atento a todos os seus sentidos, por v�rios metros, at� visualizar a frente uma fonte de luz, que voc� imagina ser a chama de uma tocha, vindo de dentro de uma porta aberta.%n");
		} else if (goAhead == Parameters.RUNAWAY) {
			System.out.printf("%nO medo invade o seu cora��o e voc� sente que ainda n�o est� � altura do desafio. Voc� se volta para a noite l� fora e corre em dire��o � seguran�a.%n");
			return;

		} else {
			System.out.printf("%nDigite uma op��o v�lida.%n");
		}

	}

}
