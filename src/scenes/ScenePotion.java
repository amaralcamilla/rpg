package scenes;

import java.util.Scanner;
import com.github.amaralcamilla.rpg.Parameters;
import com.github.amaralcamilla.rpg.Tools;
import entities.Player;

public class ScenePotion extends Scene {
	private static int potion;
	@SuppressWarnings("unused")
	private Player player;

	public ScenePotion(Scanner keyboard, Player player) {
		super(keyboard);
		this.player = player;

		potion = Tools.getSelection(keyboard,
				"\nApós derrotar o Alquimista, você olha em volta, tentando reconhecer alguma poção do estoque do inimigo. Em uma mesa, você reconhece uma pequena garrafa de vidro contendo um líquido levemente rosado, pega a garrafa e pondera se deve beber um gole.\n1: Mal não vai fazer. Bora beber!\nMelhor não arriscar.",
				1, 2);

		if (potion == Parameters.POSITIVE_ANSWER) {
			System.out.println("Você recuperou 100% sua vida! Agora você se sente revigorado para seguir adiante!");
			player.setLife(100);

		} else if (potion == Parameters.NEGATIVE_ANSWER) {
			System.out.printf("%nVocê fica receoso de beber algo produzido pelo inimigo.%n");

		} else {
			System.out.printf("%nDigite uma opção válida.%n");
		}
	}
}