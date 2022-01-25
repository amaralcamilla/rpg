package characters;

public class EnemyAlchemist extends Enemy {
	public final static int LIFE = 80;
	public final static int ATTACK = 35;
	public final static int DEFENSE = 35;
	public final static int WEAPON_DAMAGE = 15;

	public EnemyAlchemist(int life, int attack, int defense, int weapondamage) {
		super(LIFE, ATTACK, DEFENSE, WEAPON_DAMAGE);
	}
}
