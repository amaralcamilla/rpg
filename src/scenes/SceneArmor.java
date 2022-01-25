package scenes;

import java.util.Scanner;
import com.github.amaralcamilla.rpg.Parameters;
import com.github.amaralcamilla.rpg.Tools;
import combatClass.CombatClass;

public class SceneArmor extends Scene {
	private static int armor;

	public SceneArmor(Scanner keyboard, CombatClass combatClass) {
		super(keyboard);

		armor = Tools.getSelection(keyboard, "1: Pegar uma nova armadura!\n2: Seguir com a armadura esculhambada.", 1,
				2);

		if (armor == Parameters.POSITIVE_ANSWER) {
			System.out.printf(
					"%nVoc� resolve usar os equipamentos do inimigo contra ele, e trocar algumas pe�as suas, que estavam danificadas, pelas pe�as de armaduras existentes na sala.%n");

			combatClass.setDefense(combatClass.getDefense() + 5);

		} else if (armor == Parameters.NEGATIVE_ANSWER) {
			System.out.printf("%nVoc� decide que n�o precisa utilizar nada que venha das m�os do inimigo.%n");

		} else {
			System.out.printf("%nDigite uma op��o v�lida.%n");
		}
		System.out.println("De armadura nova, com " + combatClass.getDefense()
				+ " pontos de defesa, voc� se sente mais protegido para os desafios � sua frente.");
	}
}
