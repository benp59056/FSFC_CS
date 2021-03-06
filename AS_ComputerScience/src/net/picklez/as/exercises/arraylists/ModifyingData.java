package net.picklez.as.exercises.arraylists;

import java.util.ArrayList;

/**
 * @author Ben Pickering
 * @since 3 Dec 2015 | 11:30:38
 */

public class ModifyingData {

	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		String s = "this is lots of fun for every Java programmer";
		String[] split = s.split(" ");
		for (String sp : split) {
			array.add(sp);
			System.out.println(sp);
		}
		
		array = makeLength4(array);
		System.out.println("--- after makeLength4... ---");
		
		for (String loc : array) {
			System.out.println(loc);
		}
	}
	
	private static ArrayList<String> makeLength4(ArrayList<String> array) {
		ArrayList<String> localArray = new ArrayList<String>();
		for (String s : array) {
			if (s.length() == 4)
				localArray.add("****");
			localArray.add(s);
		}
		return localArray;
	}
}