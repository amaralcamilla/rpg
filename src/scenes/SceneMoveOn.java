package scenes;

public class SceneMoveOn extends Scene {

	
	// TODO texto: System.out.println("Inspirado pelo motivo...");

			System.out.println("Voc� s� pode ir � frente, ou desistir.");
			System.out.println("1: Seguir em frente!");
			System.out.println("2: Desistir.");

			moveOn = keyboard.nextInt();

			if (moveOn == POSITIVE_ANSWER) {
				System.out.println(
						"Voc� caminha, atento a todos os seus sentidos, por v�rios metros, at� visualizar a frente uma fonte de luz, que voc� imagina ser a chama de uma tocha, vindo de dentro de uma porta aberta.");
			} else if (moveOn == NEGATIVE_ANSWER) {
				System.out.println(
						"O medo invade o seu cora��o e voc� sente que ainda n�o est� � altura do desafio. Voc� se volta para a noite l� fora e corre em dire��o � seguran�a.");

				// TODO sai do jogo.

			} else {
				System.out.println("Digite uma op��o v�lida.");
			}
	
	
	
}
