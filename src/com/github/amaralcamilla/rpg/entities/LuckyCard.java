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
			player.getCombatClass().getWeapon().setWeaponDamage(player.getCombatClass().getWeapon().getWeaponDamage() + 5);
			if (player.getCombatClass().getWeapon().getClass().getSimpleName().equals("WpSword") ) {
				System.out.println(
						"\nVocê está com sorte! Sua espada está ainda mais longa e flamejante! Aumentou 5 pontos no seu ataque.");
			} else if (player.getCombatClass().getWeapon().getClass().getSimpleName().equals("WpAxe")) {
				System.out.println(
						"\nVocê está com sorte! Seu machado de batalha ficou ainda mais afiado! Aumentou 5 pontos no seu ataque.");
			} else if (player.getCombatClass().getWeapon().getClass().getSimpleName().equals("WpHammer")) {
				System.out.println(
						"\nVocê está com sorte! Seu seu martelo de guerra ficou ainda mais potente! Aumentou 5 pontos no seu ataque.");
			} else if (player.getCombatClass().getWeapon().getClass().getSimpleName().equals("WpBowAndArrow")) {
				System.out.println(
						"\nVocê está com sorte! Sua flecha agora tem um laser que persegue o alvo! Aumentou 5 pontos no seu ataque.");
			} else if (player.getCombatClass().getWeapon().getClass().getSimpleName().equals("WpCrossbowAndBolt")) {
				System.out.println(
						"\nVocê está com sorte! Seu virote agora tem ultra precisão! Aumentou 5 pontos no seu ataque.");
			} else if (player.getCombatClass().getWeapon().getClass().getSimpleName().equals("WpClub")) {
				System.out.println(
						"\nVocê está com sorte! Sua clava ficou ainda mais pontuda e afiada! Aumentou 5 pontos no seu ataque.");
			} else if (player.getCombatClass().getWeapon().getClass().getSimpleName().equals("WpStaff")) {
				System.out.println(
						"\nVocê está com sorte! Seu cajado ficou ainda mais poderoso, com ameaça vaporosa! Aumentou 5 pontos no seu ataque.");
			} else {
				System.out.println(
						"\nVocê está com sorte! Seu livro está com a energia ainda mais poderosa! Aumentou 5 pontos no seu ataque.");
				
			}
			break;
		}
		case 4:
		case 5:
		case 6: {
			if (player.getCombatClass().getClass().getSimpleName().equals("CcWarrior") || player.getCombatClass().getClass().getSimpleName().equals("CcHunter")) {
				System.out.println("\nVocê está mesmo com sorte! Sua armadura agora é de titânio e sua defesa está ainda mais forte! Ganhou 5 pontos de defesa.");
				player.getCombatClass().setDefense(player.getCombatClass().getDefense() + 5);
			} else {
				System.out.println("\nVocê está mesmo com sorte! Você encontrou um anel mágico que ajudará a bloquear as forças do inimigo! Ganhou 5 pontos de defesa.");
				player.getCombatClass().setDefense(player.getCombatClass().getDefense() + 5);
			}
			break;
		}
		case 7: 
		case 8: 
		case 9:{
			System.out.println("\nEita, que azar! O inimigo ficou ainda mais forte! ");
			player.getCombatClass().setAttack(player.getCombatClass().getAttack() - 5);
			break;
		}
		case 10: 
		case 11:
		case 12:{
			System.out.println("Veneno");
			player.getCombatClass().setDefense(player.getCombatClass().getDefense() - 5);
			break;
		}
		case 13: {
			System.out.println("Recupera 30 pts vida");
			player.setLife(player.getLife() + 20);
			break;
		}
		}
	}
}
