package scenes;

import java.util.Scanner;
import com.github.amaralcamilla.rpg.Parameters;
import com.github.amaralcamilla.rpg.Tools;
import characters.Player;
import entities.Dice10;

public class SceneCrossing extends Scene {

	public SceneCrossing(Scanner keyboard, Player player) {
		super(keyboard);

		int crossing = Tools.getSelection(keyboard, "\nVocê se pergunta se dentro dessa sala pode haver inimigos, ou alguma armadilha, e pondera sobre como passar pela porta.\n1: Andando cuidadosamente\n2: Correndo\n3: Saltando",
				1, 3);

		switch (crossing) {
		case Parameters.WALKING: {
			System.out.println("\nVocê toma cuidado e vai caminhando vagarosamente em direção à luz. Quando você pisa exatamente embaixo da porta, você sente o chão ceder levemente, como se tivesse pisado em uma pedra solta. Você ouve um ruído de mecanismos se movimentando, e uma escotilha se abre no teto atrás de você, no corredor. Flechas voam da escotilha em sua direção, e você salta para dentro da sala, porém uma delas te acerta na perna.\n");

			//TODO if life > 0 
			
			Dice10 dice = new Dice10();
			int damage = dice.rollDice();
			player.setLife(player.getLife() - damage);
			System.out.println("\nEssa doeu! Você levanta e segue com " + player.getLife() + " de vida.\n");
			break;
		}
		case Parameters.RUNNING: {
			System.out.println("\nVocê respira fundo e desata a correr em direção à sala. Quando passa pela porta, sente que pisou em uma pedra solta, mas não dá muita importância e segue para dentro da sala, olhando ao redor à procura de inimigos. Não tem ninguém, mas você ouve sons de flechas batendo na pedra atrás de você, e quando se vira, vê várias flechas no chão. Espiando pela porta, você entende que pisou em uma armadilha que soltou flechas de uma escotilha aberta no teto, mas por sorte você entrou correndo e conseguiu escapar desse ataque surpresa.\n");
			break;
		}
		case Parameters.JUMPING: {
			System.out.println("\nVocê se concentra e pula em direção à luz, saltando de antes da porta até o interior da sala.\n");
			break;
		}
		default:
			throw new Error("Digite uma opção válida.");
		}

	}

}
