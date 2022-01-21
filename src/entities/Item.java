package entities;

import java.util.ArrayList;
import java.util.List;

import weapons.Weapon;

public class Item {
	
	
	
	private List<Weapon> weapons;

	// Para existir a arma, preciso sempre ter uma classe de combate.
	// Cria contrutor para garantir que toda vez que
	// public Weapon (CombatClass combatClass) {
	// this.combatClass = combatClass;

	// Criar uma lista vazia de armas:
	public Item() {
		this.weapons = new ArrayList<Weapon>();
	}
	
	//Criar um contrutor para receber esta lista de armas. Quando esse construtor for chamado com uma lista de armas, as armas de Weapon ser�o atribu�das como par�metro.
	public Item(List<Weapon>weapons) {
		this.weapons = weapons;
	}
	
	//Gerar uma lista textual, uma representa��o em string. Para que ele possa iterar, precisa fazer o toString() em Weapon.
	public void genWeaponsTextList() {
		for (Weapon weapon : this.weapons) {
			System.out.println(weapon);
		}
	}


	// Criar uma lista b�sica com armas que j� existem. A lista n�o tem tamanho definido.
	public static Item basicWeapons() {
		List<Weapon> weapons = new ArrayList<Weapon>();
		//Chama .add para adicionar um novo elemento � lista. Dentro do pr�prio add instancio um novo objeto do tipo Weapon, sem jogar em nenhuma vari�vel.
		weapons.add(new Weapon("Espada", 16));
		weapons.add(new Weapon("Machado", 18));
		weapons.add(new Weapon("Martelo", 15));
		weapons.add(new Weapon("Clava", 14));
		weapons.add(new Weapon("Arco e flecha", 12));
		weapons.add(new Weapon("Besta e virote", 13));
		weapons.add(new Weapon("Cajado", 10));
		weapons.add(new Weapon("Livro", 8));
		
		//Pega a lista e chama o construtor do cat�logo de itens.
		return new Item(weapons);
	}

}

// Espada, machado, martelo, clava, cajado, arco e flecha, besta e virote, livro.