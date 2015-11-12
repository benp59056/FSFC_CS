package net.picklez.utils.exceptions;

/**
 * @author Ben Pickering
 * @since 12 Nov 2015 | 11:49:25
 */

public class CustomException extends Exception {

	private String message;
	
	public CustomException(String s) {
		this.message = s;
	}
	
	@Override
	public String getMessage() {
		return this.message;
	}
	 
	private static final long serialVersionUID = -3736241297047189863L;

}
