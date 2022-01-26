package com.github.amaralcamilla.rpg.entities;

import java.util.Scanner;

public class Tools {

	public static int getSelection(Scanner keyboard, String question, int first, int last) {
		int decision; 
		
		while (true) {
			System.out.println(question);
			try {
				decision = keyboard.nextInt();
			} catch (Exception e) {
				decision = -1;
				keyboard.nextLine();
			}
			if (decision >= first && decision <= last) {
				break;
			} else {
				System.out.println("Digite uma opção válida.\n");
			}
		}
		return decision;
	}
}