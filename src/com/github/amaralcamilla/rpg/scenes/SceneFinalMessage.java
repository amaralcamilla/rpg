package com.github.amaralcamilla.rpg.scenes;

import java.util.Scanner;

import com.github.amaralcamilla.rpg.characters.Player;
import com.github.amaralcamilla.rpg.entities.Parameters;

public class SceneFinalMessage extends Scene {

	public SceneFinalMessage(Scanner keyboard, Player player) {
		super(keyboard);

		System.out.println("\nVocê conseguiu, " + player.getPlayerName() + "!\n");
		if (SceneMotivation.getMotivation() == Parameters.REVENGE) {
			System.out.println(
					"Você obteve sua vingança. Você se ajoelha e cai no choro, invadido por uma sensação de alívio e felicidade. Você se vingou, tudo que sempre quis, está feito. Agora  você pode seguir sua vida.\n");
		} else {
			System.out.println(
					"\nO êxtase em que você se encontra não cabe dentro de si. Você se ajoelha e grita de alegria. A glória o aguarda, você a conquistou.\n");
		}

		System.out.println(
				"\nVocê se levanta, olha para os prisioneiros, vai de um em um e os liberta, e todos vocês saem em direção à noite, retornando à cidade. Seu dever está cumprido.\n");
		System.out.println(
				"\n- FIM DE JOGO -\n");
		return;
	}

}
