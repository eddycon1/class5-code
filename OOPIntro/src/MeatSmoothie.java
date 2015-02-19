
public class MeatSmoothie extends Hamburger implements Liquid {

	boolean frozen = false;
	boolean consumed = false;
	
	@Override
	public void freeze() {
		frozen = true;
	}

	@Override
	public void drink() throws TooFrozenToDrinkException {
		if (!consumed) {
			if (frozen) 
				throw new TooFrozenToDrinkException("Frozen meatsmoothie!"); 
			else {
				System.out.println("Just consumed a delicious meatsmoothie.");			
				consumed = true;
			}
		}

	}
	

}
