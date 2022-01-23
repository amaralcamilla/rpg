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
			System.out.printf("%nVoc� resolve usar os equipamentos do inimigo contra ele, e trocar algumas pe�as suas, que estavam danificadas, pelas pe�as de armaduras existentes na sala.%n");

			combatClass.setDefense(combatClass.getDefense() + 5);

		} else if (armor == Parameters.NEGATIVE_ANSWER) {
			System.out.printf("%nVoc� decide que n�o precisa utilizar nada que venha das m�os do inimigo.%n");

		} else {
			System.out.printf("%nDigite uma op��o v�lida.%n");
		}
		System.out.println("De armadura nova, com " + combatClass.getDefense() + " de defesa, voc� se sente mais protegido para os desafios � sua frente.");
	}
}
