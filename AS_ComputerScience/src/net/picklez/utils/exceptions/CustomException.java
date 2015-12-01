package net.picklez.utils.exceptions;

/**
 * @author Ben Pickering
 * @since 12 Nov 2015 | 11:49:25
 * A class to throw custom exceptions
 */

public class CustomException extends Exception {

	private String message;
	
	/**
	 * Sets the custom message when exception is thrown
	 * @param s - message of exception
	 */
	public CustomException(String s) {
		this.message = s;
	}
	
	/**
	 * Returns the custom message set when thrown
	 */
	@Override
	public String getMessage() {
		return this.message;
	}
	 
	private static final long serialVersionUID = -3736241297047189863L;

}
