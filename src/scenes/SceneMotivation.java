package scenes;

public class SceneMotivation extends Scene {
	public static final int  REVANGE = 1;
	public static final int  GLORY = 2;

	
	// TODO texto: System.out.println("A noite se aproxima...");

			System.out.println("Buscando uma inje��o de �nimo, voc� se for�a a lembrar o que te trouxe at� aqui.");
			System.out.println("1: Vingan�a!");
			System.out.println("2: Gl�ria!");

			motivation = keyboard.nextInt();

			if (motivation == REVENGE) {
				System.out.println(
						"Imagens daquela noite tr�gica invadem sua mente. Voc� nem precisa se esfor�ar para lembrar, pois essas mem�rias est�o sempre presentes, mesmo que de pano de fundo, quando voc� tem outros pensamentos em foco, elas nunca o deixaram. Elas s�o o combust�vel que te fizeram chegar at� aqui. E voc� sabe que n�o ir� desistir at� ter vingado a morte daqueles que foram - e pra sempre ser�o - sua fonte de amor e desejo de continuar vivo. O maldito l�der finalmente pagar� por tanto mal causado na vida de tantos (e principalmente na sua).");

			} else if (motivation == GLORY) {
				System.out.println(
						"Voc� j� consegue visualizar na sua mente o povo da cidade te recebendo de bra�os abertos, bardos criando can��es sobre seus feitos her�icos, nobres te presenteando com j�ias e diversas riquezas, taberneiros se recusando a cobrar por suas bebedeiras e comilan�as. Desde j�, voc� sente o amor do p�blico, te louvando a cada passo que d� pelas ruas, depois de destruir o vil�o que tanto assombrou a paz de todos. Por�m, voc� sabe que ainda falta o �ltimo ato dessa hist�ria. Voc� se concentra na miss�o. A gl�ria o aguarda, mas n�o antes da �ltima batalha.");

			} else {
				System.out.println("Digite uma op��o v�lida.");
			}

	
	
	
	
}
