package com.github.amaralcamilla.rpg;

import java.util.Scanner;
import characters.Enemy;
import characters.EnemyAlchemist;
import characters.EnemyGunsmith;
import characters.Player;
import scenes.SceneArmor;
import scenes.SceneCrossing;
import scenes.SceneFinalMessage;
import scenes.SceneGoAhead;
import scenes.SceneMotivation;
import scenes.ScenePotion;
import scenes.Setup;
import scenes.combat.SceneCombat;

public class GameLaunch {
	private static Scanner keyboard;
	private static Player player;

	public static void main(String[] args) {
		keyboard = new Scanner(System.in);

		System.out.println("Seja bem vindo(a) à Batalha Final do House of DEVs!\n");
		
		player = new Player("", Parameters.DEFAULT_LIFE, -1, null, -1);
		
		@SuppressWarnings("unused")
		Setup setup = new Setup(player);
		
		System.out.println(
				"\nA noite se aproxima, a lua já surge no céu, estrelas vão se acendendo, e sob a luz do crepúsculo você está prestes a entrar na fase final da sua missão. Você olha para o portal à sua frente, e sabe que a partir desse ponto, sua vida mudará para sempre.");
		System.out.println(
				"\nMemórias do caminho percorrido para chegar até aqui invadem sua mente. Você se lembra de todos os inimigos já derrotados para alcançar o covil do líder maligno. Olha para seu equipamento de combate, já danificado e desgastado depois de tantas lutas. Você está a um passo de encerrar para sempre esse mal.");

		@SuppressWarnings("unused")
		SceneMotivation sceneMotivation = new SceneMotivation(keyboard);

		System.out.println(
				"\nInspirado pelo motivo que te trouxe até aqui, você sente seu coração ardendo em chamas, suas mãos formigarem em volta da sua arma. Você a segura com firmeza. Seu foco está renovado. Você avança pelo portal.");
		System.out.println(
				"\nA escuridão te envolve. Uma iluminação muito fraca entra pelo portal às suas costas. À sua frente, só é possível perceber que você se encontra em um corredor extenso. Você só pode ir à frente, ou desistir.");

		@SuppressWarnings("unused")
		SceneGoAhead sceneGoAhead = new SceneGoAhead(keyboard);

		@SuppressWarnings("unused")
		SceneCrossing sceneCrossing = new SceneCrossing(keyboard, player);

		System.out.println(
				"\nVocê se encontra sozinho em uma sala quadrada, contendo uma porta em cada parede. Uma delas foi aquela pela qual você entrou, que estava aberta, e as outras três estão fechadas. A porta à sua frente é a maior das quatro, com inscrições em seu entorno em uma língua que você não sabe ler, mas reconhece como sendo a língua antiga utilizada pelo inimigo. Você se aproxima da porta e percebe que ela está trancada por duas fechaduras douradas, e você entende que precisará primeiro derrotar o que estiver nas outras duas portas laterais, antes de conseguir enfrentar o líder.");

		System.out.println("\nVocê se dirige para a porta à direita.");

		System.out.println(
				"\nVocê se aproxima, tentando ouvir o que acontece porta adentro, mas não escuta nada. Segura com mais força sua arma com uma mão, enquanto empurra a porta com a outra. Ao entrar, você se depara com uma sala espaçosa, com vários equipamentos de batalha pendurados nas paredes e dispostos em armários e mesas. Você imagina que este seja o arsenal do inimigo, onde estão  guardados os equipamentos que seus soldados utilizam quando saem para espalhar o terror nas cidades e vilas da região.");

		System.out.println(
				"\nEnquanto seu olhar percorre a sala, você ouve a porta se fechando e gira rapidamente para olhar para trás. Ali, de pé entre você e a porta fechada, bloqueando o caminho do seu destino, está um dos capitães do inimigo. Um orque horrendo, de armadura, capacete e espada em punho, em posição de combate. Ele avança em sua direção.");

		Enemy enemy = new Enemy(EnemyGunsmith.LIFE, EnemyGunsmith.ATTACK, EnemyGunsmith.DEFENSE, EnemyGunsmith.WEAPON_DAMAGE);
		SceneCombat sceneCombat1 = new SceneCombat(keyboard, player, enemy);
		if (sceneCombat1.getResult() != Parameters.WON) {
			System.out.println("\n- GAME OVER -");
			return;
		}

		System.out.println(
				"\nApós derrotar o Armeiro, você percebe que seus equipamentos estão muito danificados, e olha em volta, encarando todas aquelas peças de armaduras resistentes e em ótimo estado.");

		@SuppressWarnings("unused")
		SceneArmor sceneArmor = new SceneArmor(keyboard, player.getCombatClass());

		System.out.println(
				"\nEm uma mesa, você encontra uma chave dourada, e sabe que aquela chave abre uma das fechaduras da porta do líder inimigo. Você pega a chave e guarda numa pequena bolsa que leva presa ao cinto.");

		System.out.println(
				"\nVocê retorna à sala anterior e se dirige à porta da esquerda. Você se aproxima, tentando ouvir o que acontece porta adentro, mas não escuta nada. Segura com mais força sua arma com uma mão, enquanto empurra a porta com a outra. Ao entrar, você se depara com uma sala parecida com a do arsenal, mas em vez de armaduras, existem vários potes e garrafas de vidro com conteúdos misteriosos e de cores diversas, e você entende que o capitão que vive ali, realiza experimentos com diversos ingredientes, criando poções utilizadas pelos soldados para aterrorizar a região.");

		System.out.println(
				"\nNo fundo da sala, olhando em sua direção, está outro dos capitães do inimigo. Um orque horrendo, de armadura, cajado em punho, em posição de combate. Ele avança em sua direção.");

		// TODO Combate 2

		@SuppressWarnings("unused")
		ScenePotion scenePotion = new ScenePotion(keyboard, player);

		// combate3
		System.out.println(
				"\nAo lado da porta, você vê uma chave dourada em cima de uma mesa, e sabe que aquela chave abre a outra fechadura da porta do líder inimigo. Você pega a chave e guarda na pequena bolsa que leva presa ao cinto.");
		System.out.println(
				"\nDe volta à sala das portas, você se dirige à porta final. Coloca as chaves nas fechaduras, e a porta se abre. Seu coração acelera, memórias de toda a sua vida passam pela sua mente, e você percebe que está muito próximo do seu objetivo final. Segura sua arma com mais firmeza, foca no combate que você sabe que irá se seguir, e adentra a porta.");
		System.out.println(
				"\nLá dentro, você vê o líder sentado em uma poltrona dourada, com duas fogueiras de cada lado, e prisioneiros acorrentados às paredes.");
		System.out.println(
				"\nEle percebe sua chegada e se levanta com um salto, apanhando seu machado de guerra de lâmina dupla.");

		@SuppressWarnings("unused")
		SceneFinalMessage sceneFinalMessage = new SceneFinalMessage(keyboard, player);

	}
}