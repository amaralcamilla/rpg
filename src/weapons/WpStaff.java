package weapons;

public class WpStaff extends Weapon {
private final static int DAMAGE = 10;
		
	
	public WpStaff() {
		super(DAMAGE);
	}
	
	@Override
	public String getWpComplement() {
		return "com seu cajado, lançando uma bola de fogo";
	}
}
