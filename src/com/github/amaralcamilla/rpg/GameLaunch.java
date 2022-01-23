package com.github.amaralcamilla.rpg;

import java.util.Scanner;

import entities.Enemy;
import entities.Level;
import entities.Player;
import scenes.SceneArmor;
import scenes.SceneCrossing;
import scenes.SceneFinalMessage;
import scenes.SceneGoAhead;
import scenes.SceneMotivation;
import scenes.ScenePotion;
import scenes.combat.SceneCombat1;

public class GameLaunch {

	private static Scanner keyboard;
	private static Player player;
	private static int selectedLevel;	

	public static void main(String[] args) {
		keyboard = new Scanner(System.in);

		System.out.println("Seja bem vindo(a) à Batalha Final do House of DEVs!");
		
		//Setup setup = new Setup();
		
		@SuppressWarnings("unused")
		Level level;
		try {
			System.out.println("Escolha o nível de dificuldade: ");
			System.out.println("1: Fácil");
			System.out.println("2: Normal");
			System.out.println("3: Difícil");

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
				throw new Error("Digite uma opção válida (1, 2 ou 3).");
			}

		} catch (Exception e) {
			System.out.println("Digite uma opção válida (1, 2 ou 3).");
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
				throw new Error("Digite uma opção válida (1 ou 2).");
			}
		} catch (Exception e) {
			System.out.println("Digite uma opção válida (1 ou 2).");
		}

		try {
			System.out.println("Escolha uma classe de combate: ");
			if (selectedSex == Parameters.MASC) {
				System.out.println("1: Guerreiro");
				System.out.println("2: Caçador");
				System.out.println("3: Sacerdote");
				System.out.println("4: Feiticeiro");
			} else if (selectedSex == Parameters.FEMI) {
				System.out.println("1: Guerreira");
				System.out.println("2: Caçadora");
				System.out.println("3: Sacerdotisa");
				System.out.println("4: Feiticeira");
			} else {
				System.out.println("Digite uma opção válida (1, 2, 3 ou 4).");
			}

		} catch (Exception e) {
			System.out.println("Digite uma opção válida (1, 2, 3 ou 4).");
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
				throw new Error("Digite uma opção válida.");
			}

			int selectedWeapon = keyboard.nextInt();
			player.getCombatClass().setSelectedWeapon(selectedWeapon - 1);

		} catch (Exception e) {
			System.out.println("Digite uma opção válida.");
			keyboard.nextInt();
		}		
		
		System.out.printf("%nA noite se aproxima... %n");
		
		@SuppressWarnings("unused")
		SceneMotivation sceneMotivation = new SceneMotivation (keyboard);
		
		System.out.printf("%nInspirado pelo motivo que te trouxe até aqui... %n");
		System.out.printf("%nA escuridão te envolve... %n");
		
		@SuppressWarnings("unused")
		SceneGoAhead sceneGoAhead = new SceneGoAhead (keyboard);
		
		System.out.printf("%nVocê se pergunta se dentro dessa sala pode haver inimigos, ou alguma armadilha, e pondera sobre como passar pela porta.%n");
		
		@SuppressWarnings("unused")
		SceneCrossing sceneCrossing = new SceneCrossing(keyboard, player);
				
		Enemy enemy = new Enemy (100, null, -1);
		SceneCombat1 sceneCombat1 = new SceneCombat1(keyboard, player, enemy);
		if(sceneCombat1.getResult() != Parameters.WON) {
			System.out.printf("%nGame over.");
			return;
		}
		
		System.out.printf("%nApós derrotar o Armeiro, você percebe que seus equipamentos estão muito danificados, e olha em volta, encarando todas aquelas peças de armaduras resistentes e em ótimo estado.%n");
		
		@SuppressWarnings("unused")
		SceneArmor sceneArmor = new SceneArmor(keyboard, player.getCombatClass());
		
		//TODO Combate 2
		
		@SuppressWarnings("unused")
		ScenePotion scenePotion = new ScenePotion(keyboard, player);
		
		//combate3
		
		@SuppressWarnings("unused")
		SceneFinalMessage sceneFinalMessage = new SceneFinalMessage(keyboard);
		
	}

}