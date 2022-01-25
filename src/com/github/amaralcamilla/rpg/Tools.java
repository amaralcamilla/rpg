package com.github.amaralcamilla.rpg;

import java.util.Scanner;

public class Tools {

	public static int getSelection(Scanner keyboard, String s, int first, int last) {
		int option; 
		while (true) {
			System.out.println(s);
			try {
				option = keyboard.nextInt();
			} catch (Exception e) {
				option = -1;
			}
			if (option >= first && option <= last) {
				break;
			} else {
				System.out.println("Digite uma op��o v�lida.\n");
			}
		}
		return option;
	}
}