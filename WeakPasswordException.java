
/**
 * @author armanbabazadeh This is the exception class which throws
 *         WeakPasswordException
 */
public class WeakPasswordException extends Exception {

	/**
	 * This constrcutor throws exception message
	 */
	public WeakPasswordException() {
		super("The password is OK but weak - it contains fewer than 10 characters.");
	}

	public WeakPasswordException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
