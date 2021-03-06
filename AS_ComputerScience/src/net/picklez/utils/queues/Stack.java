package net.picklez.utils.queues;

import java.util.LinkedList;

import net.picklez.utils.SystemUtils;

/**
 * @author Ben Pickering
 * @since 24 Nov 2015 | 09:49:02
 * A last in; first out type of list (known as a stack)
 */

public class Stack {

	private LinkedList<Object> stackArray;

	/**
	 * Creates an instance of the LinkedList
	 */
	public Stack() {
		this.stackArray = new LinkedList<Object>();
	}

	/**
	 * Adds item to the top of the stack
	 * @param o - item to be added
	 */
	public void pushItem(Object o) {
		this.stackArray.addFirst(o);
	}

	/**
	 * Removes the top item of the stack
	 */
	public void popItem() {
		SystemUtils.printWithTime("Removed: " + this.stackArray.getFirst());
		this.stackArray.removeFirst();
	}

	/**
	 * Method to fetch size of the stack
	 * @return - size of the stack
	 */
	public int getSize() {
		return this.stackArray.size();
	}

	/**
	 * Method to determine if the stack is empty
	 * @return - true if empty
	 */
	public boolean isEmpty() {
		return this.stackArray.isEmpty();
	}

	/**
	 * Prints the stack in a formatted way
	 */
	public void printStack() {
		System.out.print("Stack {\n");
		if (this.stackArray.size() > 0) {
			for (Object o : this.stackArray) {
				System.out.print("\t" + o + "\n");
			}
		} else {
			System.out.print("\t " + "{Empty stack}" + "\n");
		}
		System.out.print("}\n");
	}

	/**
	 * A method to empty the stack
	 */
	public void popFullStack() {
		System.out.println("Popping full stack");
		this.stackArray.clear();
	}
}