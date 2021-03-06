package net.picklez.as.exercises.linkedlists.examples;

import java.util.LinkedList;

/**
 * @author Ben Pickering
 * @since 27 Nov 2015 | 13:54:04
 */

public class Searching {

	/**
	 * 'Write a program to search for an item in a linked list and
	 * display a message if found' 
	 */
	public static void main(String[] args) {
		LinkedList<Object> list = new LinkedList<Object>();
		list.add("Bored");
		list.add(1);
		list.add("lesson");
		System.out.println(find(list, 1));
		System.out.println(find(list, "out"));
	}

	private static String find(LinkedList<Object> list, Object o) {
		for (Object obj : list) {
			if (obj.equals(o))
				return "Found query";
		}
		return "Didn't find query";
	}

}