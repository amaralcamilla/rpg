package scenes;

public class SceneFinalMessage extends Scene {

	System.out.println("Voc� conseguiu!");
	if (motivation == REVANGE) {
		System.out.println(
				"Voc� obteve sua vingan�a. Voc� se ajoelha e cai no choro, invadido por uma sensa��o de al�vio e felicidade. Voc� se vingou, tudo que sempre quis, est� feito. Agora  voc� pode seguir sua vida.");
	} else if (motivation == GLORY) {
		System.out.println(
				"O �xtase em que voc� se encontra n�o cabe dentro de si. Voc� se ajoelha e grita de alegria. A gl�ria o aguarda, voc� a conquistou.");
	} else {
		System.out.println("Digite uma op��o v�lida.");
	}

	System.out.println(
			"Voc� se levanta, olha para os prisioneiros, vai de um em um e os liberta, e todos voc�s saem em dire��o � noite, retornando � cidade. Seu dever est� cumprido.");

}
	
}
