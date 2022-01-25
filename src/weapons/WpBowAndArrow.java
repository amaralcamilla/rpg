package weapons;

public class WpBowAndArrow extends Weapon {
	private final static int DAMAGE = 5;
		
	public WpBowAndArrow() {
		super(DAMAGE);
	}
	
	@Override
	public String getWpComplement() {
		return "com seu arco, a flecha atingiu";
	}
}
