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
		

	}


}
