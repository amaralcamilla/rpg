package scenes;

public class SceneMotivation extends Scene {
	public static final int  REVANGE = 1;
	public static final int  GLORY = 2;

	
	// TODO texto: System.out.println("A noite se aproxima...");

			System.out.println("Buscando uma injeção de ânimo, você se força a lembrar o que te trouxe até aqui.");
			System.out.println("1: Vingança!");
			System.out.println("2: Glória!");

			motivation = keyboard.nextInt();

			if (motivation == REVENGE) {
				System.out.println(
						"Imagens daquela noite trágica invadem sua mente. Você nem precisa se esforçar para lembrar, pois essas memórias estão sempre presentes, mesmo que de pano de fundo, quando você tem outros pensamentos em foco, elas nunca o deixaram. Elas são o combustível que te fizeram chegar até aqui. E você sabe que não irá desistir até ter vingado a morte daqueles que foram - e pra sempre serão - sua fonte de amor e desejo de continuar vivo. O maldito líder finalmente pagará por tanto mal causado na vida de tantos (e principalmente na sua).");

			} else if (motivation == GLORY) {
				System.out.println(
						"Você já consegue visualizar na sua mente o povo da cidade te recebendo de braços abertos, bardos criando canções sobre seus feitos heróicos, nobres te presenteando com jóias e diversas riquezas, taberneiros se recusando a cobrar por suas bebedeiras e comilanças. Desde já, você sente o amor do público, te louvando a cada passo que dá pelas ruas, depois de destruir o vilão que tanto assombrou a paz de todos. Porém, você sabe que ainda falta o último ato dessa história. Você se concentra na missão. A glória o aguarda, mas não antes da última batalha.");

			} else {
				System.out.println("Digite uma opção válida.");
			}

	
	
	
	
}
