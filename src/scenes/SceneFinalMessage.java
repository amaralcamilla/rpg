package scenes;

public class SceneFinalMessage extends Scene {

	System.out.println("Você conseguiu!");
	if (motivation == REVANGE) {
		System.out.println(
				"Você obteve sua vingança. Você se ajoelha e cai no choro, invadido por uma sensação de alívio e felicidade. Você se vingou, tudo que sempre quis, está feito. Agora  você pode seguir sua vida.");
	} else if (motivation == GLORY) {
		System.out.println(
				"O êxtase em que você se encontra não cabe dentro de si. Você se ajoelha e grita de alegria. A glória o aguarda, você a conquistou.");
	} else {
		System.out.println("Digite uma opção válida.");
	}

	System.out.println(
			"Você se levanta, olha para os prisioneiros, vai de um em um e os liberta, e todos vocês saem em direção à noite, retornando à cidade. Seu dever está cumprido.");

}
	
}
