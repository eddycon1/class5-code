
public class LiquidDriver {

	public static void main(String[] args) {

		Liquid[] beverages = new Liquid[2];

		beverages[0] = new Soda();
		beverages[1] = new MeatSmoothie();

		// in the loop below, note that the Soda logic means that Soda.drink() will not throw an exception, but
		// MeatSmoothie.drink() will
		
		for (Liquid l : beverages) {
			try {
				l.freeze();
				l.drink();
			} catch (Exception e) {
				System.out.println("Just caught: " + e.getMessage());
			}
		}


	}

}
