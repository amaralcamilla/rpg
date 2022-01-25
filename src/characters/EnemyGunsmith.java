package characters;

public class EnemyGunsmith extends Enemy {
	public final static int LIFE = 70;
	public final static int ATTACK = 30;
	public final static int DEFENSE = 30;
	public final static int WEAPON_DAMAGE = 10;

	public EnemyGunsmith(int life, int attack, int defense, int weapondamage) {
		super(LIFE, ATTACK, DEFENSE, WEAPON_DAMAGE);
	}
}
