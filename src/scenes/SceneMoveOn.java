package scenes;

public class SceneMoveOn extends Scene {

	
	// TODO texto: System.out.println("Inspirado pelo motivo...");

			System.out.println("Você só pode ir à frente, ou desistir.");
			System.out.println("1: Seguir em frente!");
			System.out.println("2: Desistir.");

			moveOn = keyboard.nextInt();

			if (moveOn == POSITIVE_ANSWER) {
				System.out.println(
						"Você caminha, atento a todos os seus sentidos, por vários metros, até visualizar a frente uma fonte de luz, que você imagina ser a chama de uma tocha, vindo de dentro de uma porta aberta.");
			} else if (moveOn == NEGATIVE_ANSWER) {
				System.out.println(
						"O medo invade o seu coração e você sente que ainda não está à altura do desafio. Você se volta para a noite lá fora e corre em direção à segurança.");

				// TODO sai do jogo.

			} else {
				System.out.println("Digite uma opção válida.");
			}
	
	
	
}
