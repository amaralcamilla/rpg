package com.github.amaralcamilla.rpg.scenes;

import java.util.Scanner;

import com.github.amaralcamilla.rpg.characters.Player;
import com.github.amaralcamilla.rpg.entities.Parameters;
import com.github.amaralcamilla.rpg.entities.Tools;

public class ScenePotion extends Scene {
	private static int potion;
	@SuppressWarnings("unused")
	private Player player;

	public ScenePotion(Scanner keyboard, Player player) {
		super(keyboard);
		this.player = player;

		potion = Tools.getSelection(keyboard,
				"\nApós derrotar o Alquimista, você olha em volta, tentando reconhecer alguma poção do estoque do inimigo. Em uma mesa, você reconhece uma pequena garrafa de vidro contendo um líquido levemente rosado, pega a garrafa e pondera se deve beber um gole.\n1: Mal não vai fazer.Bora beber!\n2: Melhor não arriscar.",
				1, 2);

		if (potion == Parameters.POSITIVE_ANSWER) {
			System.out.println("Você recuperou 100% sua vida, " + player.getPlayerName() + "! Agora você se sente revigorado para seguir adiante!");
			player.setLife(100);

		} else if (potion == Parameters.NEGATIVE_ANSWER) {
			System.out.println("\nVocê fica receoso de beber algo produzido pelo inimigo.\n");

		} else {
			System.out.println("\nDigite uma opção válida.\n");
		}
	}
}