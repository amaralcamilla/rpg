package scenes.combat;

import java.util.Scanner;
import com.github.amaralcamilla.rpg.Parameters;
import com.github.amaralcamilla.rpg.Tools;
import characters.Enemy;
import characters.Player;
import entities.Dice;
import entities.Level;
import scenes.Scene;
import scenes.SceneMotivation;

public class SceneCombat extends Scene {
	public Player player;
	public Enemy enemy;
	public int combatResult = Parameters.LOST;
	private int decision, damage, criticalDamage, currentDice;
	private Level level;

	public SceneCombat(Scanner keyboard, Player player, Enemy enemy, Level level) {
		super(keyboard);
		this.player = player;
		this.enemy = enemy;
		this.level = level;
		combatLoop();
	}

	public void combatLoop() {
		while (true) {

			decision = Tools.getSelection(keyboard, "1: Atacar!\n2: Fugir.", 1, 2);

			if (decision == Parameters.GO_AHEAD) {

				Dice dice = new Dice(20);
				currentDice = dice.rollDice();

				if (currentDice == 1) {
					System.out.println(
							player.getPlayerName() + ", voc� errou seu ataque! O inimigo n�o sofreu dano algum.");

				} else if (currentDice == 20) {
					criticalDamage = (int) level.getPlayerDamage() * calculateDamage(currentDice + player.getCombatClass().getAttack() + player.getCombatClass().getWeapon().getWeaponDamage());
					System.out.println(player.getPlayerName() + ", voc� acertou um ataque cr�tico! Voc� atacou "
							+ player.getCombatClass().getWeapon().getWpComplement() + " e causou " + criticalDamage
							+ " de dano no inimigo!");
					enemy.setLife(enemy.getLife() - criticalDamage);

				} else {
					damage = (int) level.getPlayerDamage() * calculateDamage(currentDice + player.getCombatClass().getAttack()
							+ player.getCombatClass().getWeapon().getWeaponDamage() - enemy.getDefense());

					System.out.println(player.getPlayerName() + ", voc� atacou "
							+ player.getCombatClass().getWeapon().getWpComplement() + " e causou " + damage
							+ " de dano no inimigo!");
					enemy.setLife(enemy.getLife() - damage);
				}

				// TODO: refatorar para usar m�todo �nico para inimigo e player

				if (enemy.getLife() > 0) {
					currentDice = dice.rollDice();

					if (currentDice == 1) {
						System.out.println("O inimigo errou o ataque! Voc� n�o sofreu dano.");

					} else if (currentDice == 20) {
						criticalDamage = (int) level.getEnemyDamage() * calculateDamage(currentDice + enemy.getAttack() + enemy.getWeaponDamage());
						player.setLife(player.getLife() - criticalDamage);
						System.out.println("\nO inimigo acertou um ataque cr�tico! Voc� sofreu " + criticalDamage
								+ " de dano e agora possui " + player.getLife() + " pontos de vida.");

					} else {
						damage = (int) level.getEnemyDamage() * calculateDamage(currentDice + enemy.getAttack() + enemy.getWeaponDamage()
								- player.getCombatClass().getDefense());
						
						
						//TODO System.out.println(">>>>>>>>>>>" + currentDice + " " + enemy.getAttack() + " " + enemy.getWeaponDamage()+ " " + player.getCombatClass().getDefense());
						
						
						player.setLife(player.getLife() - damage);
						System.out.println("O inimigo atacou! Voc� sofreu " + damage + " de dano e agora possui "
								+ player.getLife() + " pontos de vida");
					}

				} else {
					combatResult = Parameters.WON;
					return;
				}
				if (player.getLife() <= 0) {
					combatResult = Parameters.LOST;
					System.out.println(player.getPlayerName() + ", voc� n�o estava preparado para a for�a do inimigo.");
					if (SceneMotivation.getMotivation() == Parameters.REVENGE) {
						System.out.printf(
								"N�o foi poss�vel concluir sua vingan�a, e agora resta saber se algu�m se vingar� por voc�.");
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

			} else {
				System.out.println(player.getPlayerName()
						+ ", voc� n�o estava preparado para a for�a do inimigo, e decide fugir para que possa tentar novamente em uma pr�xima vez.");
				return;

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