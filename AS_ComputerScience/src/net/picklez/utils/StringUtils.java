package net.picklez.utils;

/**
 * @author Ben Pickering
 * @since 6 Oct 2015
 * Class to hold essential String-based methods
 */

public class StringUtils {

	private StringUtils() {
		
	}
	
	/**
	 * Mimic of C#'s "string.format" method
	 * @param s - String to format
	 * @param o - Parameters to parse into String
	 * @return - String formatted
	 */
	public static String formatString(String s, Object... o) {
		String result = s;
		for (int i = 0; i < o.length; i++) {
			result = result.replace("{" + i + "}", o[i].toString());
		}
		return result;
	}
	
	/**
	 * Reverses a String
	 * @param s - String to reverse
	 * @return - String in reverse order
	 */
	public static String reverseString(String s) {
		String result = "";
		
		for (char c : s.toCharArray()) {
			result = c + result;
		}
		
		return result;
	}
}