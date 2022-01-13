package com.github.amaralcamilla.rpg;

import java.util.Scanner;

public class AppRpg {
	
	private static Scanner keyboard;
	private static String playerName;
	private static int sex;
	private static int combatClass;
	private static int level;
	
	public static void main (String [] args) {
		keyboard = new Scanner(System.in);
		
		System.out.println("Seja bem vindo(a) à BATALHA FINAL DO RPGDev!");
		
		System.out.println("Escolha o nível de dificuldade: ");
		System.out.println("1: Fácil");
		System.out.println("2: Normal");
		System.out.println("3: Difícil");
		
		level = keyboard.nextInt();
		
		
		System.out.println("Digite seu nome de combate: ");
		playerName = keyboard.next();
		
		System.out.println("Boa escolha, senti firmeza!");
		System.out.println("Selecione o sexo: ");
		System.out.println("1: Masculino");
		System.out.println("2: Feminino");
		
		sex = keyboard.nextInt();
		
		System.out.println("Escolha uma classe de combate: ");
		if (sex == 1) {
			System.out.println("1: Guerreiro");
			System.out.println("2: Caçador");
			System.out.println("3: Sacerdote");
			System.out.println("4: Mago");	
		} else if (sex == 2) {
			System.out.println("1: Guerreira");
			System.out.println("2: Caçadora");
			System.out.println("3: Sacerdotisa");
			System.out.println("4: Feiticeira");
		} else {
			System.out.println("Digite uma opção válida.");
		}
		
		combatClass = keyboard.nextInt();
		
		System.out.println("Escolha uma arma: ");
				switch (combatClass) {
				case 1: {
					System.out.println("1: Espada");
					System.out.println("2: Machado");
					System.out.println("3: Martelo");
					break;
				}
				case 2: {
					System.out.println("1: Arco e flecha");
					System.out.println("2: Besta e virote");
					break;
				}
				case 3: {
					System.out.println("1: Clava");
					System.out.println("2: Livro");
					break;
				}
				case 4: {
					System.out.println("1: Cajado");
					System.out.println("2: Livro");
					break;
				}
				default:
					throw new Error ("Unexpected value: " + combatClass);
				}
	

				
		
	}


}
