
/**
 * @author armanbabazadeh This class throws the NoUpperAlphaException
 */
public class NoUpperAlphaException extends Exception {

	/**
	 * This constructor throws the NoUpperAlphaException
	 */
	public NoUpperAlphaException() {
		super("The password must contain at least one uppercase alphabetic character.");
	}

	/**
	 * @param message
	 */
	public NoUpperAlphaException(String message) {
		super(message);
	}

}
