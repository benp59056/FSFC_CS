package net.picklez.utils;

/**
 * @author Ben Pickering
 * @since 1 Dec 2015 | 15:32:31
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
	
}