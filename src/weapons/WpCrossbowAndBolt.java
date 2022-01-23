package weapons;

public class WpCrossbowAndBolt extends Weapon {
private final static int DAMAGE = 10;
		
	
	public WpCrossbowAndBolt() {
		super(DAMAGE);
	}
	
	@Override
	public String getWpComplement() {
		return "com sua besta, o virote atingiu";
	}
}
