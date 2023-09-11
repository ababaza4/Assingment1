
/**
 * @author armanbabazadeh This is a Exception class which throws
 *         UnmatchedException
 */
public class UnmatchedException extends Exception {

	/**
	 * This constructor throws Exception message
	 */
	public UnmatchedException() {
		super("Passwords do not match");
	}

	/**
	 * @param message
	 */
	public UnmatchedException(String message) {
		super(message);

	}

}
