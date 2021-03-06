package net.picklez.as.exercises.arraylists;

import java.util.ArrayList;

/**
 * @author Ben Pickering
 * @since 1 Dec 2015 | 09:23:54
 */

public class BasicArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Tom");
		names.add("Harry");
		names.add("Joe");
		
		//Printing ArrayList
		printArray(names);
		
		//Removing from ArrayList
		if (!names.isEmpty()) {
			names.remove(0);
			System.out.println("Removed first name");
		}
		printArray(names);
	}
	
	private static void printArray(ArrayList<String> array) {
		System.out.println("---");
		for (String s : array) {
			System.out.println(s);
		}
		System.out.println("---");
	}
}