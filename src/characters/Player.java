package characters;

import com.github.amaralcamilla.rpg.Parameters;

public class Player extends Character {
	private String playerName;
	private int sex;


	public Player(String playerName, int life, int sex, CombatClass combatClass, int weapon) {
		super(life, combatClass, weapon);
		this.playerName = playerName;
		this.sex = sex;
	}
	
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}

	public void setCombatClass(int selectedCombatClass) {

		switch (selectedCombatClass) {
		case Parameters.WARRIOR: {
			setCombatClass(new CcWarrior());
			break;
		}
		case Parameters.HUNTER: {
			setCombatClass(new CcHunter());
			break;
		}
		case Parameters.PRIEST: {
			setCombatClass(new CcPriest());
			break;
		}
		case Parameters.SORCERER: {
			setCombatClass(new CcSorcerer());
			break;
		}
		default:
			throw new Error("Digite uma opção válida.");
		}
		
	}

}
