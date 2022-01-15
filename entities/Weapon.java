package entities;

public abstract class Weapon {
	private String weaponName;
	private int weaponDamage;
	
	public Weapon(String weaponName, int weaponDamage) {
		super();
		this.weaponName = weaponName;
		this.weaponDamage = weaponDamage;
	}

	public String getWeaponName() {
		return weaponName;
	}

	public int getWeaponDamage() {
		return weaponDamage;
	}
	
}
