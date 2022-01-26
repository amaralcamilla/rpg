package com.github.amaralcamilla.rpg.scenes;

import java.util.Scanner;
import com.github.amaralcamilla.rpg.entities.Parameters;
import com.github.amaralcamilla.rpg.entities.Tools;

public class SceneGoAhead extends Scene {
	private static int decisionResult;

	public SceneGoAhead(Scanner keyboard) {
		super(keyboard); 

		decisionResult = Tools.getSelection(keyboard, "\nVoc� s� pode ir � frente, ou desistir.\n1: Seguir em frente!\n2: Desistir.", 1, 2);

		if (decisionResult == Parameters.GO_AHEAD) {
			System.out.println("\nVoc� caminha, atento a todos os seus sentidos, por v�rios metros, at� visualizar a frente uma fonte de luz, que voc� imagina ser a chama de uma tocha, vindo de dentro de uma porta aberta.");
		} else {
			System.out.println("\nO medo invade o seu cora��o e voc� sente que ainda n�o est� � altura do desafio. Voc� se volta para a noite l� fora e corre em dire��o � seguran�a.");
			return;
		}
	}

	public int getResult() {
		return decisionResult;
	}
}