package scenes;

import java.util.Scanner;
import com.github.amaralcamilla.rpg.Parameters;

public class SceneFinalMessage extends Scene {

	public SceneFinalMessage(Scanner keyboard) {
		super(keyboard);
		
	System.out.printf("%nVocê conseguiu!%n");
	if (SceneMotivation.getMotivation() == Parameters.REVENGE) {
		System.out.printf("%nVocê obteve sua vingança. Você se ajoelha e cai no choro, invadido por uma sensação de alívio e felicidade. Você se vingou, tudo que sempre quis, está feito. Agora  você pode seguir sua vida.%n");
	} else {
		System.out.printf("%nO êxtase em que você se encontra não cabe dentro de si. Você se ajoelha e grita de alegria. A glória o aguarda, você a conquistou.%n");
	} 

	System.out.printf("%nVocê se levanta, olha para os prisioneiros, vai de um em um e os liberta, e todos vocês saem em direção à noite, retornando à cidade. Seu dever está cumprido.%n");
	return;
}
	
}
