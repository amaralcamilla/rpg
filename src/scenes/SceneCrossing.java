package scenes;

public class SceneCrossing extends Scene {
	
	public static final int  WALKING = 1;
	public static final int  RUNNING = 2;
	public static final int  JUMPING = 3;


	System.out.println(
			"Voc� se pergunta se dentro dessa sala pode haver inimigos, ou alguma armadilha, e pondera sobre como passar pela porta.");
	System.out.println("1: Andando cuidadosamente");
	System.out.println("2: Correndo");
	System.out.println("3: Saltando");

	crossing = keyboard.nextInt();

	switch (crossing) {
	case WALKING: {
		System.out.println(
				"Voc� toma cuidado e vai caminhando vagarosamente em dire��o � luz. Quando voc� pisa exatamente embaixo da porta, voc� sente o ch�o ceder levemente, como se tivesse pisado em uma pedra solta. Voc� ouve um ru�do de mecanismos se movimentando, e uma escotilha se abre no teto atr�s de voc�, no corredor. Flechas voam da escotilha em sua dire��o, e voc� salta para dentro da sala, por�m uma delas te acerta na perna.");

		// TODO adiciona dano da flecha.

		break;
	}
	case RUNNING: {
		System.out.println(
				"Voc� respira fundo e desata a correr em dire��o � sala. Quando passa pela porta, sente que pisou em uma pedra solta, mas n�o d� muita import�ncia e segue para dentro da sala, olhando ao redor � procura de inimigos. N�o tem ningu�m, mas voc� ouve sons de flechas batendo na pedra atr�s de voc�, e quando se vira, v� v�rias flechas no ch�o. Espiando pela porta, voc� entende que pisou em uma armadilha que soltou flechas de uma escotilha aberta no teto, mas por sorte voc� entrou correndo e conseguiu escapar desse ataque surpresa.");
		break;
	}
	case JUMPING: {
		System.out.println(
				"Voc� se concentra e pula em dire��o � luz, saltando de antes da porta at� o interior da sala.");
		break;
	}
	default:
		throw new Error("Digite uma op��o v�lida.");
	}
	
}
