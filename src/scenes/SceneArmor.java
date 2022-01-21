package scenes;

import java.util.Scanner;

import combatClass.CombatClass;

public class SceneArmor extends Scene {
	private static int armor;
	public static final int POSITIVE_ANSWER = 1;
	public static final int NEGATIVE_ANSWER = 2;

	public SceneArmor(Scanner keyboard, CombatClass combatClass) {
		super(keyboard);

		System.out.println(
				"Ap�s derrotar o Armeiro, voc� percebe que seus equipamentos est�o muito danificados, e olha em volta, encarando todas aquelas pe�as de armaduras resistentes e em �timo estado.");
		System.out.println("1: Pegar uma nova armadura!");
		System.out.println("2: Seguir com a armadura esculhambada.");

		armor = keyboard.nextInt();

		if (armor == POSITIVE_ANSWER) {
			System.out.println(
					"Voc� resolve usar os equipamentos do inimigo contra ele, e trocar algumas pe�as suas, que estavam danificadas, pelas pe�as de armaduras existentes na sala. De armadura nova, voc� se sente mais protegido para os desafios � sua frente.");

			combatClass.setDefense(combatClass.getDefense() + 5);

		} else if (armor == NEGATIVE_ANSWER) {
			System.out.println("Voc� decide que n�o precisa utilizar nada que venha das m�os do inimigo.");

		} else {
			System.out.println("Digite uma op��o v�lida.");
		}
		System.out.println("xxxxx"+ combatClass.getDefense());
	}
}
