package combatClass;

import weapons.Weapon;

public abstract class CombatClass {
	private int attack;
	private int defense;
	private Weapon[] weapons;
	private int selectedWeapon;
	
	public CombatClass(int attack, int defense, Weapon[] weapons) {
		this.attack = attack;
		this.defense = defense;
		this.weapons = weapons;
	}

	public int getAttack() {
		return attack;
	}

	public int getDefense() {
		return defense;
	}

	public Weapon[] getWeapons() {
		return weapons;
	}

	public Weapon getWeapon() {
		return weapons[selectedWeapon];
	}
	
	public void setDefense(int i) {
		this.defense = i;
	}

	public int getSelectedWeapon() {
		return selectedWeapon;
	}

	public void setSelectedWeapon(int selectedWeapon) {
		this.selectedWeapon = selectedWeapon;
	}
	
	
	
}

// Guerreiro/Guerreira: espada, machado, martelo
// Caçador/Caçadora: arco+flecha, besta+virote
// Sacerdote/Sacerdotisa: clava, livro
// Feiticeiro/Feiticeira: cajado e livro