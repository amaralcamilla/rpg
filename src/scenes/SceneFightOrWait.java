package scenes;

public class SceneFightOrWait extends Scene {

	// TODO texto: System.out.println("Ao lado da porta, voc� v�....")

			System.out.println(
					"Ele percebe sua chegada e se levanta com um salto, apanhando seu machado de guerra de l�mina dupla.");
			System.out.println("1: Atacar");
			System.out.println("2: Esperar");

			fightOrWait = keyboard.nextInt();

			if (fightOrWait == POSITIVE_ANSWER) {

				// TODO loop de combate - verifique se teve vitoria de alguem

			}
			while (fightOrWait == NEGATIVE_ANSWER) {
				System.out.println("Vai ficar a� parado?");
				System.out.println("1: Atacar");
				System.out.println("2: Esperar");
			}
			
			fightOrWait = keyboard.nextInt();
	
}
