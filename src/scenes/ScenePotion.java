package scenes;

import java.util.Scanner;
import com.github.amaralcamilla.rpg.Parameters;
import entities.Player;

public class ScenePotion extends Scene {
	private static int potion;
	private Player player;

	public ScenePotion(Scanner keyboard, Player player) {
		super(keyboard);
		this.player = player;

		System.out.printf("%nApós derrotar o Alquimista, você olha em volta, tentando reconhecer alguma poção do estoque do inimigo. Em uma mesa, você reconhece uma pequena garrafa de vidro contendo um líquido levemente rosado, pega a garrafa e pondera se deve beber um gole.%n");
		System.out.println("1: Mal não vai fazer. Bora beber!");
		System.out.println("2: Melhor não arriscar.");

		potion = keyboard.nextInt();

		if (potion == Parameters.POSITIVE_ANSWER) {
			System.out.printf("%nVocê recuperou 100% sua vida! Agora você se sente revigorado para seguir adiante!%n");
			player.setLife(100);

		} else if (potion == Parameters.NEGATIVE_ANSWER) {
			System.out.printf("%nVocê fica receoso de beber algo produzido pelo inimigo.%n");

		} else {
			System.out.printf("%nDigite uma opção válida.%n");
		}

	}
}
