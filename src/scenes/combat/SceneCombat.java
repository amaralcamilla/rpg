package scenes.combat;

import java.util.Scanner;
import com.github.amaralcamilla.rpg.Parameters;
import com.github.amaralcamilla.rpg.Tools;
import characters.Enemy;
import characters.Player;
import entities.Dice;
import entities.Level;
import entities.LuckyCard;
import scenes.Scene;
import scenes.SceneMotivation;

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
							+ ", você errou seu ataque! O inimigo não sofreu dano algum.");

				} else if (playerDice == 20) {
					criticalDamage = (int) (level.getPlayerDamage()
							* calculateDamage(playerDice + player.getCombatClass().getAttack()
									+ player.getCombatClass().getWeapon().getWeaponDamage()));
					System.out.println("\n" + player.getPlayerName() + ", você acertou um ataque crítico! Você atacou "
							+ player.getCombatClass().getWeapon().getWpComplement() + " e causou " + criticalDamage
							+ " de dano no inimigo!");
					enemy.setLife(enemy.getLife() - criticalDamage);

				} else {
					damage = (int) (level.getPlayerDamage()
							* calculateDamage(playerDice + player.getCombatClass().getAttack()
									+ player.getCombatClass().getWeapon().getWeaponDamage() - enemy.getDefense()));

					System.out.println("\n" + player.getPlayerName() + ", você atacou "
							+ player.getCombatClass().getWeapon().getWpComplement() + " e causou " + damage
							+ " de dano no inimigo!");
					enemy.setLife(enemy.getLife() - damage);
				}

				// TODO: refatorar para usar método único para inimigo e player

				if (enemy.getLife() > 0) {
					enemyDice = dice.rollDice();

					if (enemyDice == 1) {
						System.out.println("\nO inimigo errou o ataque! Você não sofreu dano.");

					} else if (enemyDice == 20) {
						criticalDamage = (int) (level.getEnemyDamage()
								* calculateDamage(enemyDice + enemy.getAttack() + enemy.getWeaponDamage()));
						player.setLife(player.getLife() - criticalDamage);
						System.out.println("\nO inimigo acertou um ataque crítico! Você sofreu " + criticalDamage
								+ " de dano e agora possui " + player.getLife() + " pontos de vida.");

					} else {
						damage = (int) (level.getEnemyDamage() * calculateDamage(enemyDice + enemy.getAttack()
								+ enemy.getWeaponDamage() - player.getCombatClass().getDefense()));

						
						player.setLife(player.getLife() - damage);
						System.out.println("\nO inimigo atacou! Você sofreu " + damage + " de dano e agora possui "
								+ player.getLife() + " pontos de vida.");
						
					}

				} else {
					System.out.println("\nO inimigo não é páreo para o seu heroísmo, e jaz imóvel aos seus pés.");
					combatResult = Parameters.WON;
					return;
				}
				if (player.getLife() <= 0) {
					combatResult = Parameters.LOST;
					System.out.println(
							"\n" + player.getPlayerName() + ", você não estava preparado para a força do inimigo.");
					if (SceneMotivation.getMotivation() == Parameters.REVENGE) {
						System.out.printf(
								"\nNão foi possível concluir sua vingança, e agora resta saber se alguém se vingará por você.");
					} else if (SceneMotivation.getMotivation() == Parameters.GLORY) {
						if (player.getSex() == Parameters.MASC) {
							System.out.println(
									"A glória que buscavas não será sua, e a cidade aguarda por seu próximo herói.");
						} else {
							System.out.println(
									"A glória que buscavas não será sua, e a cidade aguarda por sua próxima heroína.");
						}
					}
					return;
				}
			} else if (decision == Parameters.RUNAWAY) {
				System.out.println("\n" + player.getPlayerName()
						+ ", você não estava preparado para a força do inimigo, e decide fugir para que possa tentar novamente em uma próxima vez.");
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