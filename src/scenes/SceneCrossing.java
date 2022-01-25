package scenes;

import java.util.Scanner;
import com.github.amaralcamilla.rpg.Parameters;
import com.github.amaralcamilla.rpg.Tools;
import entities.Dice10;
import entities.Player;

public class SceneCrossing extends Scene {
	@SuppressWarnings("unused")
	private Player player;

	public SceneCrossing(Scanner keyboard, Player player) {
		super(keyboard);
		this.player = player;

		int crossing = Tools.getSelection(keyboard, "\nVoc� se pergunta se dentro dessa sala pode haver inimigos, ou alguma armadilha, e pondera sobre como passar pela porta.\n1: Andando cuidadosamente\n2: Correndo\n3: Saltando",
				1, 3);

		switch (crossing) {
		case Parameters.WALKING: {
			System.out.printf("%nVoc� toma cuidado e vai caminhando vagarosamente em dire��o � luz. Quando voc� pisa exatamente embaixo da porta, voc� sente o ch�o ceder levemente, como se tivesse pisado em uma pedra solta. Voc� ouve um ru�do de mecanismos se movimentando, e uma escotilha se abre no teto atr�s de voc�, no corredor. Flechas voam da escotilha em sua dire��o, e voc� salta para dentro da sala, por�m uma delas te acerta na perna.%n");

			//TODO if life > 0 
			
			Dice10 dice = new Dice10();
			int damage = dice.rollDice();
			player.setLife(player.getLife() - damage);
			System.out.printf("%nEssa doeu! Voc� levanta e segue com " + player.getLife() + " de vida.%n");
			break;
		}
		case Parameters.RUNNING: {
			System.out.printf("%nVoc� respira fundo e desata a correr em dire��o � sala. Quando passa pela porta, sente que pisou em uma pedra solta, mas n�o d� muita import�ncia e segue para dentro da sala, olhando ao redor � procura de inimigos. N�o tem ningu�m, mas voc� ouve sons de flechas batendo na pedra atr�s de voc�, e quando se vira, v� v�rias flechas no ch�o. Espiando pela porta, voc� entende que pisou em uma armadilha que soltou flechas de uma escotilha aberta no teto, mas por sorte voc� entrou correndo e conseguiu escapar desse ataque surpresa.%n");
			break;
		}
		case Parameters.JUMPING: {
			System.out.printf("%nVoc� se concentra e pula em dire��o � luz, saltando de antes da porta at� o interior da sala.%n");
			break;
		}
		default:
			throw new Error("Digite uma op��o v�lida.");
		}

	}

}
