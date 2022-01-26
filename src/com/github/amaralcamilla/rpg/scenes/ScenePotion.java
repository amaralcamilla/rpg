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

		potion = Tools.getSelection(keyboard, "\nAp�s derrotar o Alquimista, voc� olha em volta, tentando reconhecer alguma po��o do estoque do inimigo. Em uma mesa, voc� reconhece uma pequena garrafa de vidro contendo um l�quido levemente rosado, pega a garrafa e pondera se deve beber um gole.\n1: Mal n�o vai fazer.Bora beber!\n2: Melhor n�o arriscar.", 1, 2);

		if (potion == Parameters.POSITIVE_ANSWER) {
			System.out.println("\nVoc� recuperou 100% sua vida, " + player.getPlayerName() + "! Agora voc� se sente revigorado para seguir adiante!");
			player.setLife(100);

		} else {
			System.out.println("\nVoc� fica receoso de beber algo produzido pelo inimigo.");
		}
	}
}