
/**
 * @author armanbabazadeh This class throws the NoDigitException
 */
public class NoDigitException extends Exception {

	/**
	 * This constructor throws the exception message
	 */
	public NoDigitException() {
		super("The password must contain at least one digit.");
	}

	/**
	 * @param message
	 */
	public NoDigitException(String message) {
		super(message);

	}

}
