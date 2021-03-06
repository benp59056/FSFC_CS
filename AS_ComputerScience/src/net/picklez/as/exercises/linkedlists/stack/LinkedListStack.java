package net.picklez.as.exercises.linkedlists.stack;

import net.picklez.utils.collections.PLinkedList;

/**
 * @author Ben Pickering
 * @since 27 Nov 2015 | 13:12:27
 */

public class LinkedListStack {

	private PLinkedList list;
	
	public LinkedListStack() {
		this.list = new PLinkedList();
	}
	
	public void addItemToStack(Object o) {
		this.list.insertFirst(o);
	}
	
	public void pop() {
		if (this.list.hasFirst()) {
			System.out.println("Removed: " + this.list.getFirst().asString());
			this.list.deleteFirst();
		} else {
			System.out.println("Cannot pop stack; stack is empty");
		}
	}

	public void printStack() {
		if (this.list.hasFirst())
			this.list.displayList();
		else
			System.out.println("Stack is empty");
	}
}