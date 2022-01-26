package com.github.amaralcamilla.rpg.scenes;

import java.util.Scanner;

import com.github.amaralcamilla.rpg.characters.CombatClass;
import com.github.amaralcamilla.rpg.entities.Parameters;
import com.github.amaralcamilla.rpg.entities.Tools;

public class SceneArmor extends Scene {
	private static int armor;

	public SceneArmor(Scanner keyboard, CombatClass combatClass) {
		super(keyboard);

		armor = Tools.getSelection(keyboard, "1: Pegar uma nova armadura!\n2: Seguir com a armadura esculhambada.", 1,
				2);

		if (armor == Parameters.POSITIVE_ANSWER) {
			System.out.println("\nVocê resolve usar os equipamentos do inimigo contra ele, e trocar algumas peças suas, que estavam danificadas, pelas peças de armaduras existentes na sala.");
			combatClass.setDefense(combatClass.getDefense() + 5);
			System.out.println("De armadura nova, com " + combatClass.getDefense()
			+ " pontos de defesa, você se sente mais protegido para os desafios à sua frente.");

		} else {
			System.out.println("\nVocê decide que não precisa utilizar nada que venha das mãos do inimigo.");

		} 
	}
}
