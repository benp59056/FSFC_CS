package net.picklez.utils;

/**
 * @author Ben Pickering
 * @since 6 Oct 2015
 */

public class StringUtils {

	private StringUtils() {
		
	}
	
	public static String formatString(String s, Object... o) {
		String result = s;
		for (int i = 0; i < o.length; i++) {
			result = result.replace("{" + i + "}", o[i].toString());
		}
		return result;
	}
}