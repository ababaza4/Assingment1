
/**
 * @author armanbabazadeh This class throws the NoSpecialCharacterException
 */
public class NoSpecialCharacterException extends Exception {

	/**
	 * This constructor throws the exception message
	 */
	public NoSpecialCharacterException() {
		super("The password must contain at least one special character");
	}

	/**
	 * @param message
	 */
	public NoSpecialCharacterException(String message) {
		super(message);

	}

}
