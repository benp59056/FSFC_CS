package net.picklez.as.exercises.linkedlists;

/**
 * @author Ben Pickering
 * @since 26 Nov 2015 | 11:20:24
 */

public class LalinLinkedListController {

	public static void main(String[] args) {
		LalinLinkedList list = new LalinLinkedList();
		list.insertFirst("Wendy", 100, "One direction", true);
		list.insertFirst("Peter Pan", 10, "Little Mix", true);
		list.insertFirst("Cap'n Hook", 50, "Cheeky Girls", true);
		list.insertFirst("Smee", 100, "Cheeky Girls", true);
		list.displayList();
	}
	
}