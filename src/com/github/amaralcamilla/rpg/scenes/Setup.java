package com.github.amaralcamilla.rpg.scenes;

import java.util.Scanner;
import com.github.amaralcamilla.rpg.Parameters;
import com.github.amaralcamilla.rpg.Tools;
import com.github.amaralcamilla.rpg.characters.Player;
import com.github.amaralcamilla.rpg.entities.Level;

public class Setup {
	private static Scanner keyboard;
	private static int selectedCombatClass;
	private static int selectedWeapon;

	public Setup(Player player, Level level) {
		keyboard = new Scanner(System.in);
		
		/*selectedLevel = Tools.getSelection(keyboard,
				"Escolha o nível de dificuldade: \n1: Fácil\n2: Normal\n3: Difícil ", 1, 3);
		
		level = Level.values()[selectedLevel - 1];
		*/
		
		System.out.println("\nDigite seu nome de combate: ");
		
		String name = keyboard.nextLine();
		player.setPlayerName(name);

		System.out.println("\nBoa escolha " + player.getPlayerName() + ", senti firmeza!");

		int selectedSex = -1;

		selectedSex = Tools.getSelection(keyboard, "\nSelecione o sexo do seu personagem:\n1: Masculino\n2: Feminino", 1, 2);
		player.setSex(selectedSex);

				
		if (selectedSex == Parameters.MASC) {
			selectedCombatClass = Tools.getSelection(keyboard,
					"\nEscolha uma classe de combate para enfrentar todos os inimigos: \n1: Guerreiro\n2: Caçador\n3: Sacerdote\n4: Feiticeiro", 1, 4);
			player.setCombatClass(selectedCombatClass);
		} else {
			selectedCombatClass = Tools.getSelection(keyboard,
					"\nEscolha uma classe de combate para enfrentar todos os inimigos: \n1: Guerreira\n2: Caçadora\n3: Sacerdotisa\n4: Feiticeira", 1,
					4);
			player.setCombatClass(selectedCombatClass);
		}

		switch (selectedCombatClass) {
		case Parameters.WARRIOR: {

			selectedWeapon = Tools.getSelection(keyboard, "\nEscolha uma arma para arrasar nos combates: \n1: Espada\n2: Machado\n3: Martelo", 1, 3);
			break;
		}
		case Parameters.HUNTER: {
			selectedWeapon = Tools.getSelection(keyboard, "\nEscolha uma arma para arrasar nos combates: \n1: Arco e flecha\n2: Besta e virote", 1, 2);
			break;
		}
		case Parameters.PRIEST: {
			selectedWeapon = Tools.getSelection(keyboard, "\nEscolha uma arma para arrasar nos combates: \n1: Clava\n2: Livro", 1, 2);
			break;
		}
		case Parameters.SORCERER: {
			selectedWeapon = Tools.getSelection(keyboard, "\nEscolha uma arma para arrasar nos combates: \n1: Cajado\n2: Livro", 1, 2);
			break;
		}
		default:
			throw new Error("Digite uma opção válida!");
		}

		player.getCombatClass().setSelectedWeapon(selectedWeapon - 1);
		
	}
	
}