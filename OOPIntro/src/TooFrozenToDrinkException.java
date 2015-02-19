/*
 * NOTE: In general, it is never a good idea to declare you own Exception subclass--it's almost always better just to use
 * Exception or RuntimeException and customize the message. If you look at this code, you'll see that this class doesn't actually
 * add any behavior; it just has a nifty name. Nifty names are not sufficient justification for creating a new class. BUT, I wanted
 * to show you that it can be done, in part as an example of how to declare a subclass. 
 */

public class TooFrozenToDrinkException extends Exception {

	private int productId;

	public TooFrozenToDrinkException() {
		super();
	}

	public TooFrozenToDrinkException(String message) {
		super(message);
	}

	public TooFrozenToDrinkException(String message, Throwable cause) {
		super(message, cause);

	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public String getMessage() {
		return super.getMessage();
	}

	public int getProductId() {
		return productId;
	}

}
