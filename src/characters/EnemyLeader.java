package characters;

public class EnemyLeader extends Enemy {
	public final static int LIFE = 90;
	public final static int ATTACK = 60;
	public final static int DEFENSE = 40;
	public final static int WEAPON_DAMAGE = 20;

	public EnemyLeader(int life, int attack, int defense, int weapondamage) {
		super(LIFE, ATTACK, DEFENSE, WEAPON_DAMAGE);
	}
}
