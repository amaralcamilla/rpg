package com.github.amaralcamilla.rpg.entities;

import com.github.amaralcamilla.rpg.characters.Enemy;
import com.github.amaralcamilla.rpg.characters.Player;

public class LuckyCard {
	private int luckyCard;
	
	public LuckyCard(Player player, Enemy enemy) {
		Dice dice = new Dice(13);
		luckyCard = dice.rollDice();

		switch (luckyCard) {
		case 1:
		case 2:
		case 3: {
			player.getCombatClass().getWeapon()
					.setWeaponDamage(player.getCombatClass().getWeapon().getWeaponDamage() + 5);
			if (player.getCombatClass().getWeapon().getClass().getSimpleName().equals("WpSword")) {
				System.out.println("\nVoc� est� com sorte! Sua espada est� ainda mais longa e flamejante! Aumentou 5 pontos no seu ataque.");
				
			} else if (player.getCombatClass().getWeapon().getClass().getSimpleName().equals("WpAxe")) {
				System.out.println("\nVoc� est� com sorte! Seu machado de batalha ficou ainda mais afiado! Aumentou 5 pontos no seu ataque.");
			
			} else if (player.getCombatClass().getWeapon().getClass().getSimpleName().equals("WpHammer")) {
				System.out.println("\nVoc� est� com sorte! Seu seu martelo de guerra ficou ainda mais potente! Aumentou 5 pontos no seu ataque.");
			
			} else if (player.getCombatClass().getWeapon().getClass().getSimpleName().equals("WpBowAndArrow")) {
				System.out.println("\nVoc� est� com sorte! Sua flecha agora tem um laser que persegue o alvo! Aumentou 5 pontos no seu ataque.");
			
			} else if (player.getCombatClass().getWeapon().getClass().getSimpleName().equals("WpCrossbowAndBolt")) {
				System.out.println("\nVoc� est� com sorte! Seu virote agora tem ultra precis�o! Aumentou 5 pontos no seu ataque.");
			
			} else if (player.getCombatClass().getWeapon().getClass().getSimpleName().equals("WpClub")) {
				System.out.println("\nVoc� est� com sorte! Sua clava ficou ainda mais pontuda e afiada! Aumentou 5 pontos no seu ataque.");
			
			} else if (player.getCombatClass().getWeapon().getClass().getSimpleName().equals("WpStaff")) {
				System.out.println("\nVoc� est� com sorte! Seu cajado ficou ainda mais poderoso, com amea�a vaporosa! Aumentou 5 pontos no seu ataque.");
			
			} else {
				System.out.println("\nVoc� est� com sorte! Seu livro est� com a energia ainda mais poderosa! Aumentou 5 pontos no seu ataque.");
			}
			break;
		}
		case 4:
		case 5:
		case 6: {
			player.getCombatClass().setDefense(player.getCombatClass().getDefense() + 5);
			if (player.getCombatClass().getClass().getSimpleName().equals("CcWarrior")
					|| player.getCombatClass().getClass().getSimpleName().equals("CcHunter")) {
				System.out.println("\nVoc� est� mesmo com sorte! Sua armadura agora � de tit�nio e sua defesa est� ainda mais forte! Ganhou 5 pontos de defesa.");
			} else {
				System.out.println("\nVoc� est� mesmo com sorte! Voc� encontrou um anel m�gico que ajudar� a bloquear as for�as do inimigo! Ganhou 5 pontos de defesa.");
			}
			break;
		}
		case 7:
		case 8:
		case 9: {
			System.out.println("\nVoc� tomou um baita gole de uma po��o maligna, suficiente para deix�-lo tonto. Voc� perdeu 15 de vida.");
			player.setLife((player.getLife() - 15));
			break;
		}
		case 10:
		case 11:
		case 12: {
			System.out.println("\nEita, que azar! Voc� perdeu seu amuleto da sorte e agora sua defesa est� mais vulner�vel.");
			player.getCombatClass().setDefense(player.getCombatClass().getDefense() - 3);
			break;
		}
		case 13: {
			System.out.println("Sorte grande!! Voc� trope�ou numa pedra rara com o n�mero 13 inscrito. De agora em diante, 13 � o seu n�mero da sorte, seu novo talism�! Voc� recuperou 20 pontos de vida.");
			player.setLife(player.getLife() + 20);
			break;
		}
		}
	}
}