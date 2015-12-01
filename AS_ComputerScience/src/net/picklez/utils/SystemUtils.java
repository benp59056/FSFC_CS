package net.picklez.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author Ben Pickering
 * @since 20 Nov 2015 | 14:21:36
 * A class to hold all essential System-based methods
 */

public class SystemUtils {

	private SystemUtils() {
		
	}
	
	/**
	 * Method to get current time as "[dd/mm/yy hh:mm:ss]"
	 * @return
	 */
	public static String getTimeStamp() {
		return "[" + new SimpleDateFormat("dd/mm/yy hh:mm:ss").format(Calendar.getInstance().getTime()) + "]";
	}
	
	/**
	 * Prints a formatted string with the time stamp
	 * @param s - String to format
	 * @param o - parameters to parse into String
	 */
	public static void printWithTime(String s, Object... o) {
		System.out.println(getTimeStamp() + " " + StringUtils.formatString(s, o));
	}
	
	/**
	 * Prints given string with a time stamp
	 * @param s - String to print
	 */
	public static void printWithTime(String s) {
		System.out.println(getTimeStamp() + " " + s);
	}
}