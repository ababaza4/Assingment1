
/**
 * @author armanbabazadeh This class throws the NoLowerAlphaException
 */

public class NoLowerAlphaException extends Exception {

	/**
	 * This constructor throws the exception message
	 */
	public NoLowerAlphaException() {
		super("The password must contain at least one lowercase alphabetic character");
	}

	/**
	 * @param message
	 */
	public NoLowerAlphaException(String message) {
		super(message);

	}

}
