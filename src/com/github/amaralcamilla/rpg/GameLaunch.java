package com.github.amaralcamilla.rpg;

import java.util.Scanner;
import com.github.amaralcamilla.rpg.characters.EnemyAlchemist;
import com.github.amaralcamilla.rpg.characters.EnemyGunsmith;
import com.github.amaralcamilla.rpg.characters.EnemyLeader;
import com.github.amaralcamilla.rpg.characters.Player;
import com.github.amaralcamilla.rpg.entities.Level;
import com.github.amaralcamilla.rpg.entities.Parameters;
import com.github.amaralcamilla.rpg.entities.Setup;
import com.github.amaralcamilla.rpg.entities.Tools;
import com.github.amaralcamilla.rpg.scenes.SceneArmor;
import com.github.amaralcamilla.rpg.scenes.SceneCombat;
import com.github.amaralcamilla.rpg.scenes.SceneCrossing;
import com.github.amaralcamilla.rpg.scenes.SceneFinalMessage;
import com.github.amaralcamilla.rpg.scenes.SceneGoAhead;
import com.github.amaralcamilla.rpg.scenes.SceneMotivation;
import com.github.amaralcamilla.rpg.scenes.ScenePotion;

public class GameLaunch {
	private static Scanner keyboard;
	private static Player player;
	private static Level level;
	private static int selectedLevel;

	public static void main(String[] args) {
		keyboard = new Scanner(System.in);

		System.out.println("Seja bem vindo(a) � Batalha Final do House of DEVs!");

		selectedLevel = Tools.getSelection(keyboard,
				"\nEscolha o n�vel de dificuldade: \n1: F�cil\n2: Normal\n3: Dif�cil ", 1, 3);

		level = Level.values()[selectedLevel - 1];

		player = new Player("", Parameters.DEFAULT_LIFE, -1, null, -1);

		@SuppressWarnings("unused")
		Setup setup = new Setup(player, level);

		System.out.println("\nA noite se aproxima, a lua j� surge no c�u, estrelas v�o se acendendo, e sob a luz do crep�sculo voc� est� prestes a entrar na fase final da sua miss�o. Voc� olha para o portal � sua frente, e sabe que a partir desse ponto, sua vida mudar� para sempre.");
		
		System.out.println("\nMem�rias do caminho percorrido para chegar at� aqui invadem sua mente. Voc� se lembra de todos os inimigos j� derrotados para alcan�ar o covil do l�der maligno. Olha para seu equipamento de combate, j� danificado e desgastado depois de tantas lutas. Voc� est� a um passo de encerrar para sempre esse mal.");

		@SuppressWarnings("unused")
		SceneMotivation sceneMotivation = new SceneMotivation(keyboard);

		System.out.println("\nInspirado pelo motivo que te trouxe at� aqui, voc� sente seu cora��o ardendo em chamas, suas m�os formigarem em volta da sua arma. Voc� a segura com firmeza. Seu foco est� renovado. Voc� avan�a pelo portal.");
		
		System.out.println("\nA escurid�o te envolve. Uma ilumina��o muito fraca entra pelo portal �s suas costas. � sua frente, s� � poss�vel perceber que voc� se encontra em um corredor extenso.");

		SceneGoAhead sceneGoAhead = new SceneGoAhead(keyboard);

		if (sceneGoAhead.getResult() != Parameters.GO_AHEAD) {
			gameOver();
		}

		@SuppressWarnings("unused")
		SceneCrossing sceneCrossing = new SceneCrossing(keyboard, player);

		System.out.println("\nVoc� se encontra sozinho em uma sala quadrada, contendo uma porta em cada parede. Uma delas foi aquela pela qual voc� entrou, que estava aberta, e as outras tr�s est�o fechadas. A porta � sua frente � a maior das quatro, com inscri��es em seu entorno em uma l�ngua que voc� n�o sabe ler, mas reconhece como sendo a l�ngua antiga utilizada pelo inimigo. Voc� se aproxima da porta e percebe que ela est� trancada por duas fechaduras douradas, e voc� entende que precisar� primeiro derrotar o que estiver nas outras duas portas laterais, antes de conseguir enfrentar o l�der.");

		System.out.println("\nVoc� se dirige para a porta � direita.");

		System.out.println("\nVoc� se aproxima, tentando ouvir o que acontece porta adentro, mas n�o escuta nada. Segura com mais for�a sua arma com uma m�o, enquanto empurra a porta com a outra. Ao entrar, voc� se depara com uma sala espa�osa, com v�rios equipamentos de batalha pendurados nas paredes e dispostos em arm�rios e mesas. Voc� imagina que este seja o arsenal do inimigo, onde est�o  guardados os equipamentos que seus soldados utilizam quando saem para espalhar o terror nas cidades e vilas da regi�o.");

		System.out.println("\nEnquanto seu olhar percorre a sala, voc� ouve a porta se fechando e gira rapidamente para olhar para tr�s. Ali, de p� entre voc� e a porta fechada, bloqueando o caminho do seu destino, est� um dos capit�es do inimigo. Um orque horrendo, de armadura, capacete e espada em punho, em posi��o de combate. Ele avan�a em sua dire��o.");

		EnemyGunsmith enemyGunsmith = new EnemyGunsmith();
		SceneCombat sceneCombat1 = new SceneCombat(keyboard, player, enemyGunsmith, level);

		if (sceneCombat1.getResult() != Parameters.WON) {
			gameOver();
		}

		System.out.println("\nAp�s derrotar o Armeiro, voc� percebe que seus equipamentos est�o muito danificados, e olha em volta, encarando todas aquelas pe�as de armaduras resistentes e em �timo estado.");

		@SuppressWarnings("unused")
		SceneArmor sceneArmor = new SceneArmor(keyboard, player.getCombatClass());

		System.out.println("\nEm uma mesa, voc� encontra uma chave dourada, e sabe que aquela chave abre uma das fechaduras da porta do l�der inimigo. Voc� pega a chave e guarda numa pequena bolsa que leva presa ao cinto.");

		System.out.println("\nVoc� retorna � sala anterior e se dirige � porta da esquerda. Voc� se aproxima, tentando ouvir o que acontece porta adentro, mas n�o escuta nada. Segura com mais for�a sua arma com uma m�o, enquanto empurra a porta com a outra. Ao entrar, voc� se depara com uma sala parecida com a do arsenal, mas em vez de armaduras, existem v�rios potes e garrafas de vidro com conte�dos misteriosos e de cores diversas, e voc� entende que o capit�o que vive ali, realiza experimentos com diversos ingredientes, criando po��es utilizadas pelos soldados para aterrorizar a regi�o.");

		System.out.println("\nNo fundo da sala, olhando em sua dire��o, est� outro dos capit�es do inimigo. Um orque horrendo, de armadura, cajado em punho, em posi��o de combate. Ele avan�a em sua dire��o.");

		EnemyAlchemist enemyAlchemist = new EnemyAlchemist();
		SceneCombat sceneCombat2 = new SceneCombat(keyboard, player, enemyAlchemist, level);

		if (sceneCombat2.getResult() != Parameters.WON) {
			gameOver();
		}

		@SuppressWarnings("unused")
		ScenePotion scenePotion = new ScenePotion(keyboard, player);

		System.out.println("\nAo lado da porta, voc� v� uma chave dourada em cima de uma mesa, e sabe que aquela chave abre a outra fechadura da porta do l�der inimigo. Voc� pega a chave e guarda na pequena bolsa que leva presa ao cinto.");
		
		System.out.println("\nDe volta � sala das portas, voc� se dirige � porta final. Coloca as chaves nas fechaduras, e a porta se abre. Seu cora��o acelera, mem�rias de toda a sua vida passam pela sua mente, e voc� percebe que est� muito pr�ximo do seu objetivo final. Segura sua arma com mais firmeza, foca no combate que voc� sabe que ir� se seguir, e adentra a porta.");
		
		System.out.println("\nL� dentro, voc� v� o l�der sentado em uma poltrona dourada, com duas fogueiras de cada lado, e prisioneiros acorrentados �s paredes.");
		
		System.out.println("\nEle percebe sua chegada e se levanta com um salto, apanhando seu machado de guerra de l�mina dupla.");

		EnemyLeader enemyLeader = new EnemyLeader();
		SceneCombat sceneCombat3 = new SceneCombat(keyboard, player, enemyLeader, level);

		if (sceneCombat3.getResult() != Parameters.WON) {
			gameOver();
		}

		@SuppressWarnings("unused")
		SceneFinalMessage sceneFinalMessage = new SceneFinalMessage(keyboard, player);
	}

	private static void gameOver() {
		System.out.println("\n\n- GAME OVER -\n\n");
		System.exit(0);
	}
}