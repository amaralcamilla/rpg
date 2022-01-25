package scenes;

import java.util.Scanner;
import com.github.amaralcamilla.rpg.Parameters;
import com.github.amaralcamilla.rpg.Tools;

public class SceneGoAhead extends Scene {
	private static int goAhead;

	public SceneGoAhead(Scanner keyboard) {
		super(keyboard);

		goAhead = Tools.getSelection(keyboard,
				"\nVoc� s� pode ir � frente, ou desistir.\n1: Seguir em frente!\n2: Desistir.", 1, 2);

		if (goAhead == Parameters.GO_AHEAD) {
			System.out.println(
					"\nVoc� caminha, atento a todos os seus sentidos, por v�rios metros, at� visualizar a frente uma fonte de luz, que voc� imagina ser a chama de uma tocha, vindo de dentro de uma porta aberta.\n");
		} else if (goAhead == Parameters.RUNAWAY) {
			System.out.println(
					"\nO medo invade o seu cora��o e voc� sente que ainda n�o est� � altura do desafio. Voc� se volta para a noite l� fora e corre em dire��o � seguran�a.\n");
			return;

		} else {
			System.out.println("\nDigite uma op��o v�lida.\n");
		}

	}

}
