package com.github.amaralcamilla.rpg.scenes;

import java.util.Scanner;

import com.github.amaralcamilla.rpg.characters.Enemy;
import com.github.amaralcamilla.rpg.characters.Player;
import com.github.amaralcamilla.rpg.entities.Dice;
import com.github.amaralcamilla.rpg.entities.Level;
import com.github.amaralcamilla.rpg.entities.LuckyCard;
import com.github.amaralcamilla.rpg.entities.Parameters;
import com.github.amaralcamilla.rpg.entities.Tools;

public class SceneCombat extends Scene {
	public Player player;
	public Enemy enemy;
	public int combatResult = Parameters.LOST;
	private int decision, damage, criticalDamage, playerDice, enemyDice;
	private Level level;
	private int luckyCardsCounter = 3;

	public SceneCombat(Scanner keyboard, Player player, Enemy enemy, Level level) {
		super(keyboard);
		this.player = player;
		this.enemy = enemy;
		this.level = level;
		combatLoop();
	}

	public void combatLoop() {
		while (true) {

			decision = Tools.getSelection(keyboard, "\n1: Atacar!\n2: Fugir.\n3: Pegar uma carta da sorte (ou azar).", 1, 3);

			if (decision == Parameters.GO_AHEAD) {

				Dice dice = new Dice(20);
				playerDice = dice.rollDice();

				if (playerDice == 1) {
					System.out.println("\n" + player.getPlayerName()
							+ ", voc� errou seu ataque! O inimigo n�o sofreu dano algum.");

				} else if (playerDice == 20) {
					criticalDamage = (int) (level.getPlayerDamage()
							* calculateDamage(playerDice + player.getCombatClass().getAttack()
									+ player.getCombatClass().getWeapon().getWeaponDamage()));
					System.out.println("\n" + player.getPlayerName() + ", voc� acertou um ataque cr�tico! Voc� atacou "
							+ player.getCombatClass().getWeapon().getWpComplement() + " e causou " + criticalDamage
							+ " de dano no inimigo!");
					enemy.setLife(enemy.getLife() - criticalDamage);

				} else {
					damage = (int) (level.getPlayerDamage()
							* calculateDamage(playerDice + player.getCombatClass().getAttack()
									+ player.getCombatClass().getWeapon().getWeaponDamage() - enemy.getDefense()));

					System.out.println("\n" + player.getPlayerName() + ", voc� atacou "
							+ player.getCombatClass().getWeapon().getWpComplement() + " e causou " + damage
							+ " de dano no inimigo!");
					enemy.setLife(enemy.getLife() - damage);
				}

				// TODO: refatorar para usar m�todo �nico para inimigo e player

				if (enemy.getLife() > 0) {
					enemyDice = dice.rollDice();

					if (enemyDice == 1) {
						System.out.println("\nO inimigo errou o ataque! Voc� n�o sofreu dano.");

					} else if (enemyDice == 20) {
						criticalDamage = (int) (level.getEnemyDamage()
								* calculateDamage(enemyDice + enemy.getAttack() + enemy.getWeaponDamage()));
						player.setLife(player.getLife() - criticalDamage);
						System.out.println("\nO inimigo acertou um ataque cr�tico! Voc� sofreu " + criticalDamage
								+ " de dano e agora possui " + player.getLife() + " pontos de vida.");

					} else {
						damage = (int) (level.getEnemyDamage() * calculateDamage(enemyDice + enemy.getAttack()
								+ enemy.getWeaponDamage() - player.getCombatClass().getDefense()));

						
						player.setLife(player.getLife() - damage);
						System.out.println("\nO inimigo atacou! Voc� sofreu " + damage + " de dano e agora possui "
								+ player.getLife() + " pontos de vida.");
						
					}

				} else {
					System.out.println("\nO inimigo n�o � p�reo para o seu hero�smo, e jaz im�vel aos seus p�s.");
					combatResult = Parameters.WON;
					return;
				}
				if (player.getLife() <= 0) {
					combatResult = Parameters.LOST;
					System.out.println(
							"\n" + player.getPlayerName() + ", voc� n�o estava preparado para a for�a do inimigo.");
					if (SceneMotivation.getMotivation() == Parameters.REVENGE) {
						System.out.printf(
								"\nN�o foi poss�vel concluir sua vingan�a, e agora resta saber se algu�m se vingar� por voc�.");
					} else if (SceneMotivation.getMotivation() == Parameters.GLORY) {
						if (player.getSex() == Parameters.MASC) {
							System.out.println(
									"A gl�ria que buscavas n�o ser� sua, e a cidade aguarda por seu pr�ximo her�i.");
						} else {
							System.out.println(
									"A gl�ria que buscavas n�o ser� sua, e a cidade aguarda por sua pr�xima hero�na.");
						}
					}
					return;
				}
			} else if (decision == Parameters.RUNAWAY) {
				System.out.println("\n" + player.getPlayerName()
						+ ", voc� n�o estava preparado para a for�a do inimigo, e decide fugir para que possa tentar novamente em uma pr�xima vez.");
				return;
			} else {
				if (luckyCardsCounter > 0 ) {
					@SuppressWarnings("unused")
				LuckyCard luckyCard = new LuckyCard(player, enemy);
					luckyCardsCounter--;
				} else {
					System.out.println("Acabaram as cartas");
				}
				
			}
		}
	}

	public int getResult() {
		return combatResult;
	}

	public int calculateDamage(int damage) {
		if (damage < 0) {
			return 0;
		} else {
			return damage;
		}
	}
}