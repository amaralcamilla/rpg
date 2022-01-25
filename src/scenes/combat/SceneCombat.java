package scenes.combat;

import java.util.Scanner;
import com.github.amaralcamilla.rpg.Parameters;
import com.github.amaralcamilla.rpg.Tools;
import characters.Enemy;
import characters.Player;
import entities.Dice20;
import scenes.Scene;
import scenes.SceneMotivation;

public class SceneCombat extends Scene {
	public Player player;
	public Enemy enemy;
	public int combatResult;
	private int decision, damage, criticalDamage, currentDice;

	public SceneCombat(Scanner keyboard, Player player, Enemy enemy) {
		super(keyboard);
		this.player = player;
		this.enemy = enemy;
	}

	public int combatLoop() {
		while (true) {

			decision = Tools.getSelection(keyboard, "1: Atacar!\n2: Fugir.", 1, 2);

			if (decision == Parameters.GO_AHEAD) {

				// TODO while player life && enemy life > 0 :

				Dice20 dice = new Dice20();
				currentDice = dice.rollDice();

				if (currentDice == 1) {
					System.out.println(
							player.getPlayerName() + ", voc� errou seu ataque! O inimigo n�o sofreu dano algum.");

				} else if (currentDice == 20) {
					criticalDamage = currentDice + player.getCombatClass().getAttack()
							+ player.getCombatClass().getWeapon().getWeaponDamage();
					System.out.println(player.getPlayerName() + ", voc� acertou um ataque cr�tico! Voc� atacou "
							+ player.getCombatClass().getWeapon().getWpComplement() + " e causou " + criticalDamage
							+ " de dano no inimigo!");
					enemy.setLife(enemy.getLife() - criticalDamage);

				} else {
					damage = currentDice + player.getCombatClass().getAttack()
							+ player.getCombatClass().getWeapon().getWeaponDamage() - enemy.getDefense(); // Supondo que
																											// defesa �
																											// sempre
																											// menor que
																											// os 3
																											// juntos
					System.out.println(player.getPlayerName() + ", voc� atacou "
							+ player.getCombatClass().getWeapon().getWpComplement() + " e causou" + damage
							+ "de dano no inimigo!");
					enemy.setLife(enemy.getLife() - damage);
				}

				// TODO: refatorar para usar m�todo �nico para inimigo e player

				if (enemy.getLife() >= 0) {
					currentDice = dice.rollDice();

					if (currentDice == 1) {
						System.out.println("O inimigo errou o ataque! Voc� n�o sofreu dano.");

					} else if (currentDice == 20) {
						criticalDamage = currentDice + enemy.getAttack() + enemy.getWeaponDamage();
						int currentLife = player.setLife(player.getLife() - criticalDamage);
						System.out.println("\nO inimigo acertou um ataque cr�tico! Voc� sofreu " + criticalDamage
								+ " de dano e agora possui " + currentLife + " pontos de vida.");

					} else {
						damage = currentDice + enemy.getAttack() + enemy.getWeaponDamage()
								- player.getCombatClass().getDefense();
						int currentLife = player.setLife(player.getLife() - damage);
						System.out.println("O inimigo atacou! Voc� sofreu " + damage + " de dano e agora possui "
								+ currentLife + " pontos de vida");
						player.setLife(player.getLife() - damage);
					}

					if (player.getLife() <= 0) {
						combatResult = Parameters.LOST;
						System.out.println(
								player.getPlayerName() + ", voc� n�o estava preparado para a for�a do inimigo.");
						if (SceneMotivation.getMotivation() == Parameters.REVENGE) {
							System.out.printf(
									"N�o foi poss�vel concluir sua vingan�a, e agora resta saber se algu�m se vingar� por voc�.");
						} else if (SceneMotivation.getMotivation() == Parameters.GLORY) {
							if (player.getSex() == Parameters.MASC) {
								System.out.println(
										"A gl�ria que buscavas n�o ser� sua, e a cidade aguarda por seu pr�ximo her�i.");
								return combatResult;
							} else {
								System.out.println(
										"A gl�ria que buscavas n�o ser� sua, e a cidade aguarda por sua pr�xima hero�na.");
								return combatResult;
							}
						}

					}
				}

			} else if (decision == Parameters.RUNAWAY) {
				System.out.println(player.getPlayerName()
						+ ", voc� n�o estava preparado para a for�a do inimigo, e decide fugir para que possa tentar novamente em uma pr�xima vez.");
				return combatResult;

			}

		}
	}

	public int getResult() {
		return combatResult;
	}
}