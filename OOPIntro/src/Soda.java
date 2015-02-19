
public class Soda implements Liquid {

	boolean frozen = false;
	boolean consumed = false;
	
	@Override
	public void freeze() {
		frozen = true;
		System.out.println("Freezing soda is a bad idea. This is now undrinkable.");
		consumed = true;
	}

	@Override
	public void drink() throws TooFrozenToDrinkException {
		if (!consumed) {
			if (frozen) 
				throw new TooFrozenToDrinkException("Frozen soda!"); 
			else {
				System.out.println("Just consumed a delicious soda.");			
				consumed = true;
			}
		}

	}

}
