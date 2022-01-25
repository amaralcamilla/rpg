package scenes;

import java.util.Scanner;
import com.github.amaralcamilla.rpg.Parameters;
import com.github.amaralcamilla.rpg.Tools;
import entities.Level;
import entities.Player;

public class Setup {
	private static Scanner keyboard;
	private static Player player;
	private static int selectedLevel;
	private static int selectedCombatClass;
	private static int selectedWeapon;

	public Setup() {
		keyboard = new Scanner(System.in);

		@SuppressWarnings("unused")
		Level level;

		selectedLevel = Tools.getSelection(keyboard,
				"Escolha o nível de dificuldade: \n1: Fácil\n2: Normal\n3: Difícil ", 1, 3);

		switch (selectedLevel) {
		case Parameters.EASY_LEVEL: {
			level = Level.EASY_LEVEL;
			break;
		}
		case Parameters.NORMAL_LEVEL: {
			level = Level.NORMAL_LEVEL;
			break;
		}
		case Parameters.HARD_LEVEL: {
			level = Level.HARD_LEVEL;
			break;
		}
		default:
			throw new Error("Digite uma opção válida!");
		}

		System.out.println("\nDigite seu nome de combate: ");

		player = new Player(keyboard.next(), Parameters.DEFAULT_LIFE, -1, null, -1);

		System.out.println("\nBoa escolha " + player.getPlayerName() + ", senti firmeza!");

		int selectedSex = -1;

		selectedSex = Tools.getSelection(keyboard, "Selecione o sexo do seu personagem:\n1: Masculino\n2: Feminino", 1,
				2);
		player.setSex(selectedSex);

		switch (selectedSex) {
		case Parameters.MASC: {
			break;
		}
		case Parameters.FEMI: {
			break;
		}
		default:
			throw new Error("Digite uma opção válida!");
		}

		// TODO check

		if (selectedSex == Parameters.MASC) {
			selectedCombatClass = Tools.getSelection(keyboard,
					"\nEscolha uma classe de combate: \n1: Guerreiro\n2: Caçador\n3: Sacerdote\n4: Feiticeiro", 1, 4);
			player.setCombatClass(selectedCombatClass);
		} else if (selectedSex == Parameters.FEMI) {
			selectedCombatClass = Tools.getSelection(keyboard,
					"\nEscolha uma classe de combate: \n1: Guerreira\n2: Caçadora\n3: Sacerdotisa\n4: Feiticeira", 1,
					4);
			player.setCombatClass(selectedCombatClass);
		} else {
			System.out.println("Digite uma opção válida!");
		}

		// TODO check

		switch (selectedCombatClass) {
		case Parameters.WARRIOR: {

			selectedWeapon = Tools.getSelection(keyboard, "\nEscolha uma arma: \n1: Espada\n2: Machado\n3: Martelo", 1,
					3);
			break;
		}
		case Parameters.HUNTER: {
			selectedWeapon = Tools.getSelection(keyboard, "\nEscolha uma arma: \n1: Arco e flecha\n2: Besta e virote",
					1, 2);
			break;
		}
		case Parameters.PRIEST: {
			selectedWeapon = Tools.getSelection(keyboard, "\nEscolha uma arma: \n1: Clava\n2: Livro", 1, 2);
			break;
		}
		case Parameters.SORCERER: {
			selectedWeapon = Tools.getSelection(keyboard, "\nEscolha uma arma: \n1: Cajado\n2: Livro", 1, 2);
			break;
		}
		default:
			throw new Error("Digite uma opção válida!");
		}

		player.getCombatClass().setSelectedWeapon(selectedWeapon - 1);
	}
}