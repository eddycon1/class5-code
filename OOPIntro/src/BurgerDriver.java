
public class BurgerDriver {

	public static void main(String[] args) {
		
		Hamburger[] breakfast = new Hamburger[4];

		breakfast[0] = new Hamburger();
		breakfast[1] = new Hamburger();
		breakfast[2] = new Cheeseburger();
		breakfast[3] = new Cheeseburger();
		
		System.out.print("Your total calories for the meal: ");
		
		int calories=0;
		
		for (Hamburger h : breakfast) {
			calories += h.getCalories();
		}
		System.out.println(calories);

		
	}

}
