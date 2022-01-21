package scenes;

public class ScenePotion extends Scene {

	System.out.println(
			"Após derrotar o Alquimista, você olha em volta, tentando reconhecer alguma poção do estoque do inimigo. Em uma mesa, você reconhece uma pequena garrafa de vidro contendo um líquido levemente rosado, pega a garrafa e pondera se deve beber um gole.");
	System.out.println("1: Mal não vai fazer. Bora beber!");
	System.out.println("2: Melhor não arriscar.");

	potion = keyboard.nextInt();

	if (potion == POSITIVE_ANSWER) {
		System.out.println("Você se sente revigorado para seguir adiante!");

		// TODO recupera 100% dos pontos de vida.

	} else if (potion == NEGATIVE_ANSWER) {
		System.out.println("Você fica receoso de beber algo produzido pelo inimigo.");

	} else {
		System.out.println("Digite uma opção válida.");
	}

	
	
}
