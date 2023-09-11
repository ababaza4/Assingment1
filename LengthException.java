
/**
 * @author armanbabazadeh This class throws LengthException
 */
public class LengthException extends Exception {

	/**
	 * This constructor throws the exception message
	 */
	public LengthException() {
		super("The password must be at least 6 characters long");
	}

	/**
	 * @param message
	 */
	public LengthException(String message) {
		super(message);
	}

}
