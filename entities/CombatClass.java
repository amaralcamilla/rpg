package entities;

public abstract class CombatClass {
	private String combatClass;
	private int attack;
	private int defense;
	private Weapon weapons;
	
	public CombatClass(String combatClass, int attack, int defense) {
		super();
		this.combatClass = combatClass;
		this.attack = attack;
		this.defense = defense;
		this.weapons = weapons;
	}

	public String getCombatClass() {
		return combatClass;
	}

	public int getAttack() {
		return attack;
	}

	public int getDefense() {
		return defense;
	}
	
	
	
}

// Guerreiro/Guerreira: espada, machado, martelo
// Caçador/Caçadora: arco+flecha, besta+virote
// Sacerdote/Sacerdotisa: clava, livro
// Feiticeiro/Feiticeira: cajado e livro
