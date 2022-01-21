package com.github.amaralcamilla.rpg;

import java.util.Scanner;

import entities.Enemy;
import entities.Level;
import entities.Player;
import scenes.SceneArmor;
import scenes.combat.SceneCombat1;

public class GameLaunch {

	private static Scanner keyboard;

	private static Player player;
	private static int selectedLevel;

	

	public static void main(String[] args) {
		keyboard = new Scanner(System.in);

		System.out.println("Seja bem vindo(a) � Batalha Final do House of DEVs!");

		Level level;
		try {
			System.out.println("Escolha o n�vel de dificuldade: ");
			System.out.println("1: F�cil");
			System.out.println("2: Normal");
			System.out.println("3: Dif�cil");

			selectedLevel = keyboard.nextInt();

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
				throw new Error("Digite uma op��o v�lida (1, 2 ou 3).");
			}

		} catch (Exception e) {
			System.out.println("Digite uma op��o v�lida (1, 2 ou 3).");
			selectedLevel = keyboard.nextInt();
		}

		System.out.println("Digite seu nome de combate: ");

		player = new Player(keyboard.next(), Parameters.DEFAULT_LIFE, -1, null, -1);

		System.out.println("Boa escolha " + player.getPlayerName() + ", senti firmeza!");

		int selectedSex = -1;
		
		try {
			System.out.println("Selecione o sexo do seu personagem: ");
			System.out.println("1: Masculino");
			System.out.println("2: Feminino");

			selectedSex = keyboard.nextInt();
			player.setSex(selectedSex);

			switch (selectedSex) {
			case Parameters.MASC: {
				break;
			}
			case Parameters.FEMI: {
				break;
			}
			default:
				throw new Error("Digite uma op��o v�lida (1 ou 2).");
			}
		} catch (Exception e) {
			System.out.println("Digite uma op��o v�lida (1 ou 2).");
		}

		try {
			System.out.println("Escolha uma classe de combate: ");
			if (selectedSex == Parameters.MASC) {
				System.out.println("1: Guerreiro");
				System.out.println("2: Ca�ador");
				System.out.println("3: Sacerdote");
				System.out.println("4: Feiticeiro");
			} else if (selectedSex == Parameters.FEMI) {
				System.out.println("1: Guerreira");
				System.out.println("2: Ca�adora");
				System.out.println("3: Sacerdotisa");
				System.out.println("4: Feiticeira");
			} else {
				System.out.println("Digite uma op��o v�lida (1, 2, 3 ou 4).");
			}

		} catch (Exception e) {
			System.out.println("Digite uma op��o v�lida (1, 2, 3 ou 4).");
		}

		int selectedCombatClass;
		selectedCombatClass = keyboard.nextInt();
		
		player.setCombatClass(selectedCombatClass);

		try {
			System.out.println("Escolha uma arma: ");

			switch (selectedCombatClass) {
			case Parameters.WARRIOR: {
				System.out.println("1: Espada");
				System.out.println("2: Machado");
				System.out.println("3: Martelo");
				break;
			}
			case Parameters.HUNTER: {
				System.out.println("1: Arco e flecha");
				System.out.println("2: Besta e virote");
				break;
			}
			case Parameters.PRIEST: {
				System.out.println("1: Clava");
				System.out.println("2: Livro");
				break;
			}
			case Parameters.SORCERER: {
				System.out.println("1: Cajado");
				System.out.println("2: Livro");
				break;
			}
			default:
				throw new Error("Digite uma op��o v�lida.");
			}

			int selectedWeapon = keyboard.nextInt();
			player.getCombatClass().setSelectedWeapon(selectedWeapon -1);

		} catch (Exception e) {
			System.out.println("Digite uma op��o v�lida.");
			keyboard.nextInt();
		}

		@SuppressWarnings("unused")
		SceneArmor sceneArmor = new SceneArmor(keyboard, player.getCombatClass());
		
		Enemy enemy = new Enemy (100, null, -1);
		SceneCombat1 sceneCombat1 = new SceneCombat1(keyboard, player, enemy);
		if(sceneCombat1.getResult() != Parameters.WON) {
			System.out.println("Vc perdeu");
			return;
		}
		
		// TODO COLOCAR RESULTADO DE COMBATE DENTRO DE UMA VARI�VEL (decidir se continua jogo ou n�o)
		
		
	}

}