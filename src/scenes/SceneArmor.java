package scenes;

import java.util.Scanner;
import com.github.amaralcamilla.rpg.Parameters;
import combatClass.CombatClass;

public class SceneArmor extends Scene {
	private static int armor;

	public SceneArmor(Scanner keyboard, CombatClass combatClass) {
		super(keyboard);

		System.out.println("1: Pegar uma nova armadura!");
		System.out.println("2: Seguir com a armadura esculhambada.");

		armor = keyboard.nextInt();

		if (armor == Parameters.POSITIVE_ANSWER) {
			System.out.printf("%nVocê resolve usar os equipamentos do inimigo contra ele, e trocar algumas peças suas, que estavam danificadas, pelas peças de armaduras existentes na sala.%n");

			combatClass.setDefense(combatClass.getDefense() + 5);

		} else if (armor == Parameters.NEGATIVE_ANSWER) {
			System.out.printf("%nVocê decide que não precisa utilizar nada que venha das mãos do inimigo.%n");

		} else {
			System.out.printf("%nDigite uma opção válida.%n");
		}
		System.out.println("De armadura nova, com " + combatClass.getDefense() + " de defesa, você se sente mais protegido para os desafios à sua frente.");
	}
}
