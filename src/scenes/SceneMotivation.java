package scenes;

import java.util.Scanner;
import com.github.amaralcamilla.rpg.Parameters;
import com.github.amaralcamilla.rpg.Tools;

public class SceneMotivation extends Scene {
	protected static int motivation;

	public SceneMotivation(Scanner keyboard) {
		super(keyboard);

		motivation = Tools.getSelection(keyboard,
				"\nBuscando uma injeção de ânimo, você se força a lembrar o que te trouxe até aqui.\n1: Vingança!\n2: Glória!",
				1, 2);

		if (motivation == Parameters.REVENGE) {
			System.out.printf(
					"%nImagens daquela noite trágica invadem sua mente. Você nem precisa se esforçar para lembrar, pois essas memórias estão sempre presentes, mesmo que de pano de fundo, quando você tem outros pensamentos em foco, elas nunca o deixaram. Elas são o combustível que te fizeram chegar até aqui. E você sabe que não irá desistir até ter vingado a morte daqueles que foram - e pra sempre serão - sua fonte de amor e desejo de continuar vivo. O maldito líder finalmente pagará por tanto mal causado na vida de tantos (e principalmente na sua).%n");
		} else if (motivation == Parameters.GLORY) {
			System.out.printf(
					"%nVocê já consegue visualizar na sua mente o povo da cidade te recebendo de braços abertos, bardos criando canções sobre seus feitos heróicos, nobres te presenteando com jóias e diversas riquezas, taberneiros se recusando a cobrar por suas bebedeiras e comilanças. Desde já, você sente o amor do público, te louvando a cada passo que dá pelas ruas, depois de destruir o vilão que tanto assombrou a paz de todos. Porém, você sabe que ainda falta o último ato dessa história. Você se concentra na missão. A glória o aguarda, mas não antes da última batalha.%n");
		} else {
			System.out.printf("%nDigite uma opção válida.%n");
		}
	}

	public static int getMotivation() {
		return motivation;
	}
}