package scenes;

public class SceneCrossing extends Scene {
	
	public static final int  WALKING = 1;
	public static final int  RUNNING = 2;
	public static final int  JUMPING = 3;


	System.out.println(
			"Você se pergunta se dentro dessa sala pode haver inimigos, ou alguma armadilha, e pondera sobre como passar pela porta.");
	System.out.println("1: Andando cuidadosamente");
	System.out.println("2: Correndo");
	System.out.println("3: Saltando");

	crossing = keyboard.nextInt();

	switch (crossing) {
	case WALKING: {
		System.out.println(
				"Você toma cuidado e vai caminhando vagarosamente em direção à luz. Quando você pisa exatamente embaixo da porta, você sente o chão ceder levemente, como se tivesse pisado em uma pedra solta. Você ouve um ruído de mecanismos se movimentando, e uma escotilha se abre no teto atrás de você, no corredor. Flechas voam da escotilha em sua direção, e você salta para dentro da sala, porém uma delas te acerta na perna.");

		// TODO adiciona dano da flecha.

		break;
	}
	case RUNNING: {
		System.out.println(
				"Você respira fundo e desata a correr em direção à sala. Quando passa pela porta, sente que pisou em uma pedra solta, mas não dá muita importância e segue para dentro da sala, olhando ao redor à procura de inimigos. Não tem ninguém, mas você ouve sons de flechas batendo na pedra atrás de você, e quando se vira, vê várias flechas no chão. Espiando pela porta, você entende que pisou em uma armadilha que soltou flechas de uma escotilha aberta no teto, mas por sorte você entrou correndo e conseguiu escapar desse ataque surpresa.");
		break;
	}
	case JUMPING: {
		System.out.println(
				"Você se concentra e pula em direção à luz, saltando de antes da porta até o interior da sala.");
		break;
	}
	default:
		throw new Error("Digite uma opção válida.");
	}
	
}
