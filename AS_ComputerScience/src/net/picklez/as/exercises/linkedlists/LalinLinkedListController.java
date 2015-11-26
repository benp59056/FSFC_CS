package net.picklez.as.exercises.linkedlists;

/**
 * @author Ben Pickering
 * @since 26 Nov 2015 | 11:20:24
 */

public class LalinLinkedListController {

	public static void main(String[] args) {
		LalinLinkedList list = new LalinLinkedList();
		LalinLink wendy = new LalinLink("Wendy", 100, "One direction", true);
		list.insertFirst(wendy);
		list.insertFirst("Peter Pan", 10, "Little Mix", true);
		list.insertFirst("Cap'n Hook", 50, "Cheeky Girls", true);
		list.insertFirst("Smee", 100, "Cheeky Girls", true);
		list.displayList();
		System.out.println("--- Inserting ---");
		list.insertAfter(wendy, new LalinLink("Insert after", 10, "Insert after", true));
		list.displayList();
		list.deleteFirst();
		System.out.println("Deleted first");
		list.displayList();
	}
	
}