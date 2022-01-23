package scenes;

import java.util.Scanner;
import com.github.amaralcamilla.rpg.Parameters;
import entities.Player;

public class ScenePotion extends Scene {
	private static int potion;
	@SuppressWarnings("unused")
	private Player player;

	public ScenePotion(Scanner keyboard, Player player) {
		super(keyboard);
		this.player = player;

		System.out.printf("%nAp�s derrotar o Alquimista, voc� olha em volta, tentando reconhecer alguma po��o do estoque do inimigo. Em uma mesa, voc� reconhece uma pequena garrafa de vidro contendo um l�quido levemente rosado, pega a garrafa e pondera se deve beber um gole.%n");
		System.out.println("1: Mal n�o vai fazer. Bora beber!");
		System.out.println("2: Melhor n�o arriscar.");

		potion = keyboard.nextInt();

		if (potion == Parameters.POSITIVE_ANSWER) {
			System.out.println("Voc� recuperou 100% sua vida! Agora voc� se sente revigorado para seguir adiante!");
			player.setLife(100);

		} else if (potion == Parameters.NEGATIVE_ANSWER) {
			System.out.printf("%nVoc� fica receoso de beber algo produzido pelo inimigo.%n");

		} else {
			System.out.printf("%nDigite uma op��o v�lida.%n");
		}

	}
}
