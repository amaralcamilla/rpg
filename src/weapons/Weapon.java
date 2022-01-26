package weapons;

public abstract class Weapon {
	private int weaponDamage;
	
	public Weapon(int weaponDamage) {
		this.weaponDamage = weaponDamage;
	}

	public int getWeaponDamage() {
		return weaponDamage;
	}
	
	public void setWeaponDamage(int weaponDamage) {
		this.weaponDamage = weaponDamage;
	}

	public abstract String getWpComplement();
}

