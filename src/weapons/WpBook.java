package weapons;

public class WpBook extends Weapon {
	private final static int DAMAGE = 10;
		
	public WpBook() {
		super(DAMAGE);
	}
	
	@Override
	public String getWpComplement() {
		return "absorvendo energia do livro com uma mão e liberando com a outra";
	}
}
