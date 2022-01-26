package com.github.amaralcamilla.rpg.scenes;

import java.util.Scanner;
import com.github.amaralcamilla.rpg.characters.Player;
import com.github.amaralcamilla.rpg.entities.Parameters;

public class SceneFinalMessage extends Scene {

	public SceneFinalMessage(Scanner keyboard, Player player) {
		super(keyboard);

		System.out.println("\nVoc� conseguiu, " + player.getPlayerName() + "!");
		
		if (SceneMotivation.getMotivation() == Parameters.REVENGE) {
			System.out.println("Voc� obteve sua vingan�a. Voc� se ajoelha e cai no choro, invadido por uma sensa��o de al�vio e felicidade. Voc� se vingou, tudo que sempre quis, est� feito. Agora  voc� pode seguir sua vida.");
			
		} else {
			System.out.println("\nO �xtase em que voc� se encontra n�o cabe dentro de si. Voc� se ajoelha e grita de alegria. A gl�ria o aguarda, voc� a conquistou.");
		}

		System.out.println("Voc� se levanta, olha para os prisioneiros, vai de um em um e os liberta, e todos voc�s saem em dire��o � noite, retornando � cidade. Seu dever est� cumprido.");
		System.out.println("\n\n- FIM DE JOGO -\n\n");
		return;
	}
}