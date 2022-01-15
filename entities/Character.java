package entities;

public class Character {
	private String playerName;
	private int life, attack, defense, sex, combatClass, weapon;

	public Character(String playerName, int life, int attack, int defense, int sex, int combatClass, int weapon) {
		super();
		this.playerName = playerName;
		this.life = life;
		this.attack = attack;
		this.defense = defense;
		this.sex = sex;
		this.combatClass = combatClass;
		this.weapon = weapon;
	}

	public String getPlayerName() {
		return playerName;
	}

	public int getLife() {
		return life;
	}

	public int getAttack() {
		return attack;
	}

	public int getDefense() {
		return defense;
	}

	public int getSex() {
		return sex;
	}

	public int getCombatClass() {
		return combatClass;
	}

	public int getWeapon() {
		return weapon;
	}

}
