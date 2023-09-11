
/**
 * @author armanbabazadeh Exception class which throws InvalidSequenceException
 *
 */
public class InvalidSequenceException extends Exception {

	/**
	 * This constructor is used to write the throw message
	 */
	public InvalidSequenceException() {
		super("The password cannot contain more than two of the same character in sequence.");
	}

	/**
	 * @param message
	 */
	public InvalidSequenceException(String message) {
		super(message);

	}

}
