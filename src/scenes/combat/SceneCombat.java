package scenes.combat;

import java.util.Scanner;
import com.github.amaralcamilla.rpg.Parameters;
import entities.Dice20;
import entities.Enemy;
import entities.Player;
import scenes.Scene;

public class SceneCombat extends Scene {
	public int combatResult;
	public Player player;
	public Enemy enemy;
	private int damage;
	private int criticalDamage;

	public SceneCombat(Scanner keyboard, Player player, Enemy enemy) {
		super(keyboard);
		this.player = player;
		this.enemy = enemy;
	}

	public int combatLoop() {
		while (true) {
			System.out.println("1: Atacar");
			System.out.println("2: Fugir");

			int decision = keyboard.nextInt();

			if (decision == Parameters.GO_AHEAD) {
				Dice20 dice = new Dice20();

				int currentDice = dice.rollDice();
				if (currentDice == 1) {
					System.out.println("Você errou seu ataque! O inimigo não sofreu dano algum.");
				} else if (currentDice == 20) {
					criticalDamage = currentDice + player.getCombatClass().getAttack()
							+ player.getCombatClass().getWeapon().getWeaponDamage();
					System.out.println("Você acertou um ataque crítico! Você atacou "
							+ player.getCombatClass().getWeapon().getWpComplement() + " e causou" + criticalDamage
							+ "de dano no inimigo!");
					enemy.setLife(enemy.getLife() - criticalDamage);

				} else {
					damage = currentDice + player.getCombatClass().getAttack()
							+ player.getCombatClass().getWeapon().getWeaponDamage()
							- enemy.getCombatClass().getDefense();
					System.out.println("Você atacou " + player.getCombatClass().getWeapon().getWpComplement()
							+ " e causou" + damage + "de dano no inimigo!");
					enemy.setLife(enemy.getLife() - damage);
				} // Supondo que defesa é sempre menor que os 3 juntos

				// TODO: refatorar para usar método único para inimigo e player

				if (enemy.getLife() >= 0) {
					damage = dice.rollDice();
					player.setLife(player.getLife() - damage);
				}

			} else if (decision == Parameters.RUNAWAY) {
				System.out.println(
						"Você não estava preparado para a força do inimigo, e decide fugir para que possa tentar novamente em uma próxima vez.");
				System.out.printf("/nGAME OVER");
				return combatResult;

			} else {
				System.out.println("Escolha uma das opções");
			}

			if (player.getLife() <= 0) {
				combatResult = Parameters.LOST;
				return combatResult;
			}
		}
	}

	public int getResult() {
		return combatResult;
	}
}