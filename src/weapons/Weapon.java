package weapons;

public abstract class Weapon {
	private int weaponDamage;
	
	public Weapon(int weaponDamage) {
		this.weaponDamage = weaponDamage;
	}

	public int getWeaponDamage() {
		return weaponDamage;
	}
	
	//Quando iterar (for) em Item, aparecer� a representa��o em string.
	//public String toString() {
		//return String.format(this.getWeaponName(), this.getWeaponDamage());
//	}
}

