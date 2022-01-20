package entities;

public abstract class Weapon {
	private int weaponDamage;
	
	public Weapon(int weaponDamage) {
		this.weaponDamage = weaponDamage;
	}

	public int getWeaponDamage() {
		return weaponDamage;
	}
	
}
