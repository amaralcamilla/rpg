package com.github.amaralcamilla.rpg;

import java.util.Scanner;

public class AppRpg {
	
	private static Scanner keyboard;
	private static String playerName;
	private static int level, sex, combatClass, weapon, motivation, moveOn, crossing;
	
	public static void main (String [] args) {
		keyboard = new Scanner(System.in);
		
		System.out.println("Seja bem vindo(a) à Batalha Final do House of DEVs!");
		
		System.out.println("Escolha o nível de dificuldade: ");
		System.out.println("1: Fácil");
		System.out.println("2: Normal");
		System.out.println("3: Difícil");
		
		level = keyboard.nextInt();
		
		
		System.out.println("Digite seu nome de combate: ");
		playerName = keyboard.next();
		
		System.out.println("Boa escolha, senti firmeza!");
		System.out.println("Selecione o sexo: ");
		System.out.println("1: Masculino");
		System.out.println("2: Feminino");
		
		sex = keyboard.nextInt();
		
		System.out.println("Escolha uma classe de combate: ");
		if (sex == 1) {
			System.out.println("1: Guerreiro");
			System.out.println("2: Caçador");
			System.out.println("3: Sacerdote");
			System.out.println("4: Mago");	
		} else if (sex == 2) {
			System.out.println("1: Guerreira");
			System.out.println("2: Caçadora");
			System.out.println("3: Sacerdotisa");
			System.out.println("4: Feiticeira");
		} else {
			System.out.println("Digite uma opção válida.");
		}
		
		combatClass = keyboard.nextInt();
		
		System.out.println("Escolha uma arma: ");
		
		switch (combatClass) {
		case 1: {
			System.out.println("1: Espada");
			System.out.println("2: Machado");
			System.out.println("3: Martelo");
			break;
				}
		case 2: {
			System.out.println("1: Arco e flecha");
			System.out.println("2: Besta e virote");
			break;
				}
		case 3: {
			System.out.println("1: Clava");
			System.out.println("2: Livro");
			break;
				}
		case 4: {
			System.out.println("1: Cajado");
			System.out.println("2: Livro");
			break;
				}
		default:
			throw new Error ("Digite uma opção válida.");
				} 
		
		weapon = keyboard.nextInt();
				
		// TODO texto: System.out.println("A noite se aproxima...");
		
		System.out.println("Buscando uma injeção de ânimo, você se força a lembrar o que te trouxe até aqui.");
		System.out.println("1: Vingança!");
		System.out.println("2: Glória!");
		
		motivation = keyboard.nextInt();
		
		if (motivation == 1) {
			System.out.println("Imagens daquela noite trágica invadem sua mente. Você nem precisa se esforçar para lembrar, pois essas memórias estão sempre presentes, mesmo que de pano de fundo, quando você tem outros pensamentos em foco, elas nunca o deixaram. Elas são o combustível que te fizeram chegar até aqui. E você sabe que não irá desistir até ter vingado a morte daqueles que foram - e pra sempre serão - sua fonte de amor e desejo de continuar vivo. O maldito líder finalmente pagará por tanto mal causado na vida de tantos (e principalmente na sua).");
			
		} else if (motivation == 2) {
			System.out.println("Você já consegue visualizar na sua mente o povo da cidade te recebendo de braços abertos, bardos criando canções sobre seus feitos heróicos, nobres te presenteando com jóias e diversas riquezas, taberneiros se recusando a cobrar por suas bebedeiras e comilanças. Desde já, você sente o amor do público, te louvando a cada passo que dá pelas ruas, depois de destruir o vilão que tanto assombrou a paz de todos. Porém, você sabe que ainda falta o último ato dessa história. Você se concentra na missão. A glória o aguarda, mas não antes da última batalha.");
			
		} else {
			System.out.println("Digite uma opção válida.");
		}
		
		// TODO texto: System.out.println("Inspirado pelo motivo...");
		
		System.out.println("Você só pode ir à frente, ou desistir.");
		System.out.println("1: Seguir em frente!");
		System.out.println("2: Desistir.");
		
		moveOn = keyboard.nextInt();
		
		if (moveOn == 1) {
			System.out.println("Você caminha, atento a todos os seus sentidos, por vários metros, até visualizar a frente uma fonte de luz, que você imagina ser a chama de uma tocha, vindo de dentro de uma porta aberta.");
			
		} else if (moveOn == 2) {
			System.out.println("O medo invade o seu coração e você sente que ainda não está à altura do desafio. Você se volta para a noite lá fora e corre em direção à segurança.");
			
		} else {
			System.out.println("Digite uma opção válida.");
		}
		
		System.out.println("Você se pergunta se dentro dessa sala pode haver inimigos, ou alguma armadilha, e pondera sobre como passar pela porta.");
		System.out.println("1: Andando cuidadosamente");
		System.out.println("2: Correndo");
		System.out.println("3: Saltando");
		
		
		switch (crossing) {
		case 1: {
			System.out.println("Você toma cuidado e vai caminhando vagarosamente em direção à luz. Quando você pisa exatamente embaixo da porta, você sente o chão ceder levemente, como se tivesse pisado em uma pedra solta. Você ouve um ruído de mecanismos se movimentando, e uma escotilha se abre no teto atrás de você, no corredor. Flechas voam da escotilha em sua direção, e você salta para dentro da sala, porém uma delas te acerta na perna.");
			
			// TODO adiciona dano da flecha.
			break;
				}
		case 2: {
			System.out.println("Você respira fundo e desata a correr em direção à sala. Quando passa pela porta, sente que pisou em uma pedra solta, mas não dá muita importância e segue para dentro da sala, olhando ao redor à procura de inimigos. Não tem ninguém, mas você ouve sons de flechas batendo na pedra atrás de você, e quando se vira, vê várias flechas no chão. Espiando pela porta, você entende que pisou em uma armadilha que soltou flechas de uma escotilha aberta no teto, mas por sorte você entrou correndo e conseguiu escapar desse ataque surpresa.");
			break;
				}
		case 3: {
			System.out.println("Você se concentra e pula em direção à luz, saltando de antes da porta até o interior da sala.");
			break;
				}
		default:
			throw new Error ("Digite uma opção válida.");
				} 
		
		crossing = keyboard.nextInt();
		
	}


}
