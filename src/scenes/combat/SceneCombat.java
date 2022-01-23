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
			
			
			if (decision == 1) {
				Dice20 dice = new Dice20();
				int damage = dice.rollDice() + player.getCombatClass().getAttack() + player.getCombatClass().getWeapon().getWeaponDamage();
				enemy.setLife(enemy.getLife() - damage);
				
				if (enemy.getLife() >= 0) {
					damage = dice.rollDice();
					player.setLife(player.getLife() - damage);
				}
			
			} else if (decision == 2) {
				combatResult = Parameters.RUNAWAY;
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

	// se vida do personagem && vida do inimigo for < 0:

	// Ataque = pontos de ataque do personagem + ataque da arma + rolamento Dice
	// resultado do rolamento Dice20 --> dano diminuído (da defesa) do defensor
	// Se o rolamento for = 1, o defensor não sofre dano.
	// Se o rolamento for = 20, acerto crítico, dano de 100%, sem subtrair pelos
	// pontos de defesa do defensor.

	// Quando inimigo ataca:
	// Cálculo do ataque e aualização dos pontos de vida do jogador. Exibir mensagem
	// "O inimigo atacou! Vc sofreu dano X e possui Y pontos de vida".

	// Vez do jogador: Perguntar se quer atacar ou fugir.
	// Fugir: exibir mensagem.
	// Atacar: realizar cálculo do ataque, atualizar pontos de vida do inimigo
	// Exibir msg: "Você atacou [com arma X] e causou Y de dano no inimigo".
	// Se errar o ataque, exibir msg: "Você errou ...."
	// Se acertar ataque crítico, exibir msg: "Você acertou um ataque crítico! [com
	// arma X]"
	// Se inimigo morrer, exibir: "O inimigo não é páreo para seu heroísmo"
}
