
public class Cheeseburger extends Hamburger {

	private int cheeseSlices;

	public Cheeseburger(int cheeseSlices) {
		this.cheeseSlices = cheeseSlices;
	}
	
	public Cheeseburger() {
		this(1);
	}
	
	 // this needs to depend on the amount of cheese
	@Override
	public int getCalories() {
		return super.getCalories() + 100 * cheeseSlices;
	}
}
	
