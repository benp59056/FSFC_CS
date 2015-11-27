package net.picklez.as.exercises.linkedlists.queue;

import net.picklez.utils.collections.PLinkedList;

/**
 * @author Ben Pickering
 * @since 27 Nov 2015 | 13:27:51
 */

public class LinkedListQueue {

private PLinkedList list;
	
	public LinkedListQueue() {
		this.list = new PLinkedList();
	}
	
	public void addItemToQueue(Object o) {
		this.list.insertLast(o);
	}
	
	public void removeFirst() {
		this.list.deleteFirst();
	}

	public void printQueue() {
		if (this.list.hasFirst())
			this.list.displayList();
		else
			System.out.println("Queue is empty");
	}
	
}