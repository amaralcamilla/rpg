package weapons;

public class WpHammer extends Weapon {
private final static int DAMAGE = 10;
		
	
	public WpHammer() {
		super(DAMAGE);
	}
	
	@Override
	public String getWpComplement() {
		return "com seu martelo";
	}
}
