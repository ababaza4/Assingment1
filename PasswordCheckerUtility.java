import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author armanbabazadeh This is the utility class for the project CMSC204
 *         CRN#21528 Prof.Aygun
 * @date 9/10/2023
 */
public class PasswordCheckerUtility {

	public PasswordCheckerUtility() {

	}

	// This method compares the equality of two passwords
	/**
	 * @param password
	 * @param passwordConfirm
	 * @throws UnmatchedException
	 */
	public static void comparePasswords(java.lang.String password, java.lang.String passwordConfirm)
			throws UnmatchedException {

		if (!password.equals(passwordConfirm)) { // If passwords are not equal throw Exception
			throw new UnmatchedException();
		}

	}

	// In this method it compares equality but returns true if equal and false
	// otherwise
	/**
	 * @param password
	 * @param passwordConfirm
	 * @return boolean
	 */
	public static boolean comparePasswordsWithReturn(java.lang.String password, java.lang.String passwordConfirm) {

		if (password.equals(passwordConfirm)) { // If equal return true else return false
			return true;
		} else {

			return false;
		}

	}

	// In this method we check if the password has a valid length
	/**
	 * @param password
	 * @return boolean
	 * @throws LengthException
	 */
	public static boolean isValidLength(java.lang.String password) throws LengthException {

		if (password.length() >= 6) {// If the length of the password is equal or greater than 6
			return true; // return true
		}
		throw new LengthException(); // otherwise throw Exception

	}

	// In this method we check if the String has at least a Upper case character
	/**
	 * @param password
	 * @return boolean
	 * @throws NoUpperAlphaException
	 */
	public static boolean hasUpperAlpha​(java.lang.String password) throws NoUpperAlphaException {

		for (int i = 0; i < password.length(); i++) { // We iterate through the string
			if (Character.isUpperCase(password.charAt(i))) { // Check if a character is uppercase
				return true; // if true return true
			}

		}
		throw new NoUpperAlphaException(); // Otherwise throw Exception

	}

	// This method checks if we have at least one lower case character
	/**
	 * @param password
	 * @return boolean
	 * @throws NoLowerAlphaException
	 */
	public static boolean hasLowerAlpha​(java.lang.String password) throws NoLowerAlphaException {

		for (int i = 0; i < password.length(); i++) { // We iterate through the string
			if (Character.isLowerCase(password.charAt(i))) { // Check if a character is lowercase
				return true; // if true return true
			}

		}
		throw new NoLowerAlphaException(); // Otherwise throw Exception

	}

	// This method checks if within the string there is at least a digit
	/**
	 * @param password
	 * @return boolean
	 * @throws NoDigitException
	 */
	public static boolean hasDigit​(java.lang.String password) throws NoDigitException {
		for (int i = 0; i < password.length(); i++) { // iterate through the string
			if (Character.isDigit(password.charAt(i))) { // check if password has digit
				return true; // return true
			}
		}
		throw new NoDigitException(); // otherwise throw Exception
	}

	/**
	 * @param password
	 * @return boolean
	 * @throws NoSpecialCharacterException
	 */

	// This method checks if the password has a special character
	public static boolean hasSpecialChar(java.lang.String password) throws NoSpecialCharacterException {
		Pattern pattern = Pattern.compile("[a-zA-Z0-9]*"); // We use patten object
		Matcher matcher = pattern.matcher(password); // And a matcher object which matches from ASCI
		if ((!matcher.matches())) { // If matcher doesnt match return true
			return true;
		} else {
			throw new NoSpecialCharacterException(); // Or throw Exception
		}

	}

	// In this method I check to make sure there is not more than 2 characters in
	// the same sequence
	/**
	 * @param password
	 * @return boolean
	 * @throws InvalidSequenceException
	 */
	public static boolean NoSameCharInSequence​(java.lang.String password) throws InvalidSequenceException {
		int counter = 0; // I set the counter equal to zero

		for (int i = 0; i < password.length(); i++) { // Iterate through the password
			if (i > 0) { // After we pass the first character
				if (password.charAt(i) == password.charAt(i - 1)) { // If the current letter is equal to the previous
					counter++; // Increment the counter
					if (counter >= 2) { // And if the counter is greater than 2 throw Exception
						throw new InvalidSequenceException();
					}

				} else { // If the current is not equal to previous reset the counter
					counter = 0;
				}
			}
		}

		return true; // and return true

	}

	/**
	 * @param password
	 * @return boolean
	 * @throws LengthException
	 * @throws NoUpperAlphaException
	 * @throws NoLowerAlphaException
	 * @throws NoDigitException
	 * @throws NoSpecialCharacterException
	 * @throws InvalidSequenceException
	 */
	// In this method I check to see if other methods conditions are true
	public static boolean isValidPassword​(java.lang.String password) throws LengthException, NoUpperAlphaException,
			NoLowerAlphaException, NoDigitException, NoSpecialCharacterException, InvalidSequenceException {
		boolean passwordIsValid = true; // I create a passwordIsValid boolean

		if (!PasswordCheckerUtility.isValidLength(password)) { // I go through each requriment for the password
			passwordIsValid = false; // if a requriment is broken password boolean is equal to false
			throw new LengthException(); // Throw exception
		}

		if (!PasswordCheckerUtility.hasUpperAlpha​(password)) {
			passwordIsValid = false;
			throw new NoUpperAlphaException();
		}
		if (!PasswordCheckerUtility.hasLowerAlpha​(password)) {
			passwordIsValid = false;
			throw new NoLowerAlphaException();
		}
		if (!PasswordCheckerUtility.hasDigit​(password)) {
			passwordIsValid = false;
			throw new NoDigitException();
		}
		if (!PasswordCheckerUtility.hasSpecialChar(password)) {
			passwordIsValid = false;
			throw new NoSpecialCharacterException();
		}
		if (!PasswordCheckerUtility.NoSameCharInSequence​(password)) {
			passwordIsValid = false;
			throw new InvalidSequenceException();
		}

		return passwordIsValid; // return the boolean value of passwordIsValid

	}// If all conditions pass, the password is fully valid

	/**
	 * @param password
	 * @return boolean
	 */
	// This method checks if the password is within the 6-9 character requirement
	public static boolean hasBetweenSixAndNineChars​(java.lang.String password) {
		if (password.length() >= 6 && password.length() <= 9) { // If the length of the password is greater than 6 and
																// less 9
			return true; // return true
		}
		return false;
	}

	/**
	 * @param password
	 * @return boolean
	 * @throws WeakPasswordException
	 */
	// This method checks if the password is weak
	public static boolean isWeakPassword(String password) throws WeakPasswordException {
		try {
			if (PasswordCheckerUtility.isValidPassword​(password)
					&& PasswordCheckerUtility.hasBetweenSixAndNineChars​(password)) { // If valid and only between 6-9
																						// its weak
				throw new WeakPasswordException(); // throw Exception
			}
		} catch (LengthException | NoUpperAlphaException | NoLowerAlphaException | NoDigitException
				| NoSpecialCharacterException | InvalidSequenceException e) {

		} // catch the exceptions

		return false; // Return false if the password is valid but has the weak length
	}

	/**
	 * @param passwords
	 * @return ArrayList<String>
	 */
	// We are getting the invalid passwords withtin the textfile
	public static java.util.ArrayList<java.lang.String> getInvalidPasswords​(
			java.util.ArrayList<java.lang.String> passwords) {
		ArrayList<String> invalidPasswords = new ArrayList<String>(); // Create new arraylist called invalidpasswords
		for (int i = 0; i < passwords.size(); i++) { // Iterate through arraylist
			try {
				PasswordCheckerUtility.isValidPassword​(passwords.get(i)); // Check if the password is valid
			} catch (Exception e) {
				invalidPasswords.add(passwords.get(i) + " " + e.getMessage()); // If not add them and return message

			}
		}
		return invalidPasswords; // return arrayList

	}

}
