package scenes;

public class ScenePotion extends Scene {

	System.out.println(
			"Ap�s derrotar o Alquimista, voc� olha em volta, tentando reconhecer alguma po��o do estoque do inimigo. Em uma mesa, voc� reconhece uma pequena garrafa de vidro contendo um l�quido levemente rosado, pega a garrafa e pondera se deve beber um gole.");
	System.out.println("1: Mal n�o vai fazer. Bora beber!");
	System.out.println("2: Melhor n�o arriscar.");

	potion = keyboard.nextInt();

	if (potion == POSITIVE_ANSWER) {
		System.out.println("Voc� se sente revigorado para seguir adiante!");

		// TODO recupera 100% dos pontos de vida.

	} else if (potion == NEGATIVE_ANSWER) {
		System.out.println("Voc� fica receoso de beber algo produzido pelo inimigo.");

	} else {
		System.out.println("Digite uma op��o v�lida.");
	}

	
	
}
