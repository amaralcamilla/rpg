package com.github.amaralcamilla.rpg.scenes;

import java.util.Scanner;

import com.github.amaralcamilla.rpg.characters.Player;
import com.github.amaralcamilla.rpg.entities.Dice;
import com.github.amaralcamilla.rpg.entities.Parameters;
import com.github.amaralcamilla.rpg.entities.Tools;

public class SceneCrossing extends Scene {

	public SceneCrossing(Scanner keyboard, Player player) {
		super(keyboard);

		int crossing = Tools.getSelection(keyboard,
				"\nVocê se pergunta se dentro dessa sala pode haver inimigos, ou alguma armadilha, e pondera sobre como passar pela porta.\n1: Andando cuidadosamente\n2: Correndo\n3: Saltando",
				1, 3);

		switch (crossing) {
		case Parameters.WALKING: {
			System.out.println(
					"\nVocê toma cuidado e vai caminhando vagarosamente em direção à luz. Quando você pisa exatamente embaixo da porta, você sente o chão ceder levemente, como se tivesse pisado em uma pedra solta. Você ouve um ruído de mecanismos se movimentando, e uma escotilha se abre no teto atrás de você, no corredor. Flechas voam da escotilha em sua direção, e você salta para dentro da sala, porém uma delas te acerta na perna.");

			// TODO if life > 0

			if (player.getLife() > 0) {
				Dice dice = new Dice(10);
				int arrowDamage = dice.rollDice();
				player.setLife(player.getLife() - arrowDamage);
				System.out.println("\nEssa doeu, " + player.getPlayerName() + "! Mas nada te abala. Você se levanta e segue com " + player.getLife() + " de vida.");
			}
			break;

		}
		case Parameters.RUNNING: {
			System.out.println(
					"\nVocê respira fundo e desata a correr em direção à sala. Quando passa pela porta, sente que pisou em uma pedra solta, mas não dá muita importância e segue para dentro da sala, olhando ao redor à procura de inimigos. Não tem ninguém, mas você ouve sons de flechas batendo na pedra atrás de você, e quando se vira, vê várias flechas no chão. Espiando pela porta, você entende que pisou em uma armadilha que soltou flechas de uma escotilha aberta no teto, mas por sorte você entrou correndo e conseguiu escapar desse ataque surpresa.");
			break;
		}
		case Parameters.JUMPING: {
			System.out.println(
					"\nVocê se concentra e pula em direção à luz, saltando de antes da porta até o interior da sala.");
			break;
		}
		}
	}
}
