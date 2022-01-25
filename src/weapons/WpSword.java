package weapons;

public class WpSword extends Weapon {
private final static int DAMAGE = 8;
		
	
	public WpSword() {
		super(DAMAGE);
	}
	
	@Override
	public String getWpComplement() {
		return "com sua espada";
	}
}
