package net.picklez.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author Ben Pickering
 * @since 20 Nov 2015 | 14:21:36
 */

public class SystemUtils {

	private SystemUtils() {
		
	}
	
	public static String getTimeStamp() {
		return "[" + new SimpleDateFormat("dd/mm/yy hh:mm:ss").format(Calendar.getInstance().getTime()) + "]";
	}
	
	public static void printWithTime(String s, Object... o) {
		System.out.println(getTimeStamp() + " " + StringUtils.formatString(s, o));
	}
	
	public static void printWithTime(String s) {
		System.out.println(getTimeStamp() + " " + s);
	}
}