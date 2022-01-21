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
				"Após derrotar o Armeiro, você percebe que seus equipamentos estão muito danificados, e olha em volta, encarando todas aquelas peças de armaduras resistentes e em ótimo estado.");
		System.out.println("1: Pegar uma nova armadura!");
		System.out.println("2: Seguir com a armadura esculhambada.");

		armor = keyboard.nextInt();

		if (armor == POSITIVE_ANSWER) {
			System.out.println(
					"Você resolve usar os equipamentos do inimigo contra ele, e trocar algumas peças suas, que estavam danificadas, pelas peças de armaduras existentes na sala. De armadura nova, você se sente mais protegido para os desafios à sua frente.");

			combatClass.setDefense(combatClass.getDefense() + 5);

		} else if (armor == NEGATIVE_ANSWER) {
			System.out.println("Você decide que não precisa utilizar nada que venha das mãos do inimigo.");

		} else {
			System.out.println("Digite uma opção válida.");
		}
		System.out.println("xxxxx"+ combatClass.getDefense());
	}
}
