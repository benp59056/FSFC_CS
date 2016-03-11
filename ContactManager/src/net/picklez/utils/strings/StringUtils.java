package net.picklez.utils.strings;

/**
 * @author Ben Pickering
 * @since 3 Jan 2016 | 15:06:07
 * Description: Class to hold essential string-based methods
 */

public class StringUtils {

	/**
	 * Private constructor to prevent instantiation as all methods should be globally accessible
	 */
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
}