package weapons;

public class WpClub extends Weapon {
private final static int DAMAGE = 10;
		
	public WpClub() {
		super(DAMAGE);
	}
	
	@Override
	public String getWpComplement() {
		return "com sua clava";
	}
}
