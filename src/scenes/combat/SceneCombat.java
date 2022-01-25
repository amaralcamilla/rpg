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
							player.getPlayerName() + ", você errou seu ataque! O inimigo não sofreu dano algum.");

				} else if (currentDice == 20) {
					criticalDamage = currentDice + player.getCombatClass().getAttack()
							+ player.getCombatClass().getWeapon().getWeaponDamage();
					System.out.println(player.getPlayerName() + ", você acertou um ataque crítico! Você atacou "
							+ player.getCombatClass().getWeapon().getWpComplement() + " e causou" + criticalDamage
							+ "de dano no inimigo!");
					enemy.setLife(enemy.getLife() - criticalDamage);

				} else {
					damage = currentDice + player.getCombatClass().getAttack()
							+ player.getCombatClass().getWeapon().getWeaponDamage()
							- enemy.getDefense(); // Supondo que defesa é sempre menor que os 3 juntos
					System.out.println(player.getPlayerName() + ", você atacou "
							+ player.getCombatClass().getWeapon().getWpComplement() + " e causou" + damage
							+ "de dano no inimigo!");
					enemy.setLife(enemy.getLife() - damage);
				}

				// TODO: refatorar para usar método único para inimigo e player

				if (enemy.getLife() >= 0) {
					currentDice = dice.rollDice();

					if (currentDice == 1) {
						System.out.println("O inimigo errou o ataque! Você não sofreu dano.");

					} else if (currentDice == 20) {
						criticalDamage = currentDice + enemy.getAttack()
								+ enemy.getWeaponDamage();
						int currentLife = player.setLife(player.getLife() - criticalDamage);
						System.out.println("\nO inimigo acertou um ataque crítico! Você sofreu " + criticalDamage
								+ " de dano e agora possui " + currentLife + " pontos de vida.");

					} else {
						damage = currentDice + enemy.getAttack()
								+ enemy.getWeaponDamage()
								- player.getCombatClass().getDefense();
						int currentLife = player.setLife(player.getLife() - damage);
						System.out.println("O inimigo atacou! Você sofreu " + damage + " de dano e agora possui "
								+ currentLife + " pontos de vida");
						player.setLife(player.getLife() - damage);
					}

					if (player.getLife() <= 0) {
						combatResult = Parameters.LOST;
						System.out.println(
								player.getPlayerName() + ", você não estava preparado para a força do inimigo.");
						if (SceneMotivation.getMotivation() == Parameters.REVENGE) {
							System.out.printf(
									"Não foi possível concluir sua vingança, e agora resta saber se alguém se vingará por você.");
						} else if (SceneMotivation.getMotivation() == Parameters.GLORY) {
							if (player.getSex() == Parameters.MASC) {
								System.out.println(
										"A glória que buscavas não será sua, e a cidade aguarda por seu próximo herói.");
								return combatResult;
							} else {
								System.out.println(
										"A glória que buscavas não será sua, e a cidade aguarda por sua próxima heroína.");
								return combatResult;
							}
						}
						System.out.println("\n\n- GAME OVER -");
					}
				}

			} else if (decision == Parameters.RUNAWAY) {
				System.out.println(player.getPlayerName()
						+ ", você não estava preparado para a força do inimigo, e decide fugir para que possa tentar novamente em uma próxima vez.");
				System.out.println("\n\n- GAME OVER -");
				return combatResult;

			} else {
				System.out.println("Escolha uma opção válida.");
			}

		}
	}

	public int getResult() {
		return combatResult;
	}
}