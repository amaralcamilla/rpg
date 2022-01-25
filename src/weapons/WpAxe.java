package weapons;

public class WpAxe extends Weapon {
	private final static int DAMAGE = 18;
		
	public WpAxe() {
		super(DAMAGE);
	}
	
	@Override
	public String getWpComplement() {
		return "com seu machado";
	}

	
}
