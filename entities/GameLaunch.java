package com.github.amaralcamilla.rpg;

import java.util.Scanner;
import entities.Item;

public class GameLaunch {

	private static Scanner keyboard;
	
	private static String playerName;
	private static int level, sex, combatClass, weapon;

	public static final int EASY_LEVEL = 1;
	public static final int NORMAL_LEVEL = 2;
	public static final int HARD_LEVEL = 3;

	public static final int WARRIOR = 1;
	public static final int HUNTER = 2;
	public static final int PRIEST = 3;
	public static final int SORCERER = 4;

	public static final int MASC = 1;
	public static final int FEMI = 2;


	public static void main(String[] args) {
		keyboard = new Scanner(System.in);

		System.out.println("Seja bem vindo(a) à Batalha Final do House of DEVs!");

		try {
			System.out.println("Escolha o nível de dificuldade: ");
			System.out.println("1: Fácil");
			System.out.println("2: Normal");
			System.out.println("3: Difícil");

			level = keyboard.nextInt();

			switch (level) {
			case EASY_LEVEL: {
				break;
			}
			case NORMAL_LEVEL: {
				break;
			}
			case HARD_LEVEL: {
				break;
			}
			default:
				throw new Error("Digite uma opção válida (1, 2 ou 3).");
			}

		} catch (Exception e) {
			System.out.println("Digite uma opção válida (1, 2 ou 3).");
			level = keyboard.nextInt();
		}

		System.out.println("Digite seu nome de combate: ");
		playerName = keyboard.next();
		System.out.println("Boa escolha " + playerName + ", senti firmeza!");

		
		try {
			System.out.println("Selecione o sexo do seu personagem: ");
			System.out.println("1: Masculino");
			System.out.println("2: Feminino");

			sex = keyboard.nextInt();

			switch (sex) {
			case MASC: {
				break;
			}
			case FEMI: {
				break;
			}
			default:
				throw new Error("Digite uma opção válida (1 ou 2).");
			}
		} catch (Exception e) {
			System.out.println("Digite uma opção válida (1 ou 2).");
			sex = keyboard.nextInt();
		}

		
		try { 
		System.out.println("Escolha uma classe de combate: ");
		if (sex == MASC) {
			System.out.println("1: Guerreiro");
			System.out.println("2: Caçador");
			System.out.println("3: Sacerdote");
			System.out.println("4: Feiticeiro");
		} else if (sex == FEMI) {
			System.out.println("1: Guerreira");
			System.out.println("2: Caçadora");
			System.out.println("3: Sacerdotisa");
			System.out.println("4: Feiticeira");
		} else {
			System.out.println("Digite uma opção válida (1, 2, 3 ou 4).");
		}

		combatClass = keyboard.nextInt();

		} catch (Exception e) {
			System.out.println("Digite uma opção válida (1, 2, 3 ou 4).");
			combatClass = keyboard.nextInt();
		}
		
		try {
		System.out.println("Escolha uma arma: ");

		switch (combatClass) {
		case WARRIOR: {
			System.out.println("1: Espada");
			System.out.println("2: Machado");
			System.out.println("3: Martelo");
			break;
		}
		case HUNTER: {
			System.out.println("1: Arco e flecha");
			System.out.println("2: Besta e virote");
			break;
		}
		case PRIEST: {
			System.out.println("1: Clava");
			System.out.println("2: Livro");
			break;
		}
		case SORCERER: {
			System.out.println("1: Cajado");
			System.out.println("2: Livro");
			break;
		}
		default:
			throw new Error("Digite uma opção válida.");
		}

		weapon = keyboard.nextInt();
		
		} catch (Exception e) {
			System.out.println("Digite uma opção válida.");
			weapon = keyboard.nextInt();
		}
		
	}
}
