package com.github.amaralcamilla.rpg;

import java.util.Scanner;
import entities.Enemy;
import entities.Player;
import scenes.SceneArmor;
import scenes.SceneCrossing;
import scenes.SceneFinalMessage;
import scenes.SceneGoAhead;
import scenes.SceneMotivation;
import scenes.ScenePotion;
import scenes.Setup;
import scenes.combat.SceneCombat1;

public class GameLaunch {
	private static Scanner keyboard;
	private static Player player;

	public static void main(String[] args) {
		keyboard = new Scanner(System.in);

		System.out.println("Seja bem vindo(a) à Batalha Final do House of DEVs!");

		@SuppressWarnings("unused")
		Setup setup = new Setup();

		System.out.printf("%nA noite se aproxima... %n");

		@SuppressWarnings("unused")
		SceneMotivation sceneMotivation = new SceneMotivation(keyboard);

		System.out.printf("%nInspirado pelo motivo que te trouxe até aqui... %n");
		System.out.printf("%nA escuridão te envolve... %n");

		@SuppressWarnings("unused")
		SceneGoAhead sceneGoAhead = new SceneGoAhead(keyboard);

		@SuppressWarnings("unused")
		SceneCrossing sceneCrossing = new SceneCrossing(keyboard, player);

		Enemy enemy = new Enemy(100, null, -1);
		SceneCombat1 sceneCombat1 = new SceneCombat1(keyboard, player, enemy);
		if (sceneCombat1.getResult() != Parameters.WON) {
			System.out.printf("%nGame over.");
			return;
		}

		System.out.printf(
				"%nApós derrotar o Armeiro, você percebe que seus equipamentos estão muito danificados, e olha em volta, encarando todas aquelas peças de armaduras resistentes e em ótimo estado.%n");

		@SuppressWarnings("unused")
		SceneArmor sceneArmor = new SceneArmor(keyboard, player.getCombatClass());

		// TODO Combate 2

		@SuppressWarnings("unused")
		ScenePotion scenePotion = new ScenePotion(keyboard, player);

		// combate3

		@SuppressWarnings("unused")
		SceneFinalMessage sceneFinalMessage = new SceneFinalMessage(keyboard);

	}
}