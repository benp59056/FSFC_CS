package net.picklez.utils.queues;

import java.util.LinkedList;

import net.picklez.utils.SystemUtils;

/**
 * @author Ben Pickering
 * @since 24 Nov 2015 | 10:18:34
 * A first in; first out type-list (Known as a queue)
 */

public class Queue {

	private LinkedList<Object> queueArray;

	/**
	 * Creates instance of LinkedList
	 */
	public Queue() {
		this.queueArray = new LinkedList<Object>();
	}

	/**
	 * Adds item to back of queue
	 * @param o - item to be added
	 */
	public void addItem(Object o) {
		this.queueArray.addLast(o);
	}

	/**
	 * Removes item from the front of the queue
	 */
	public void removeItem() {
		SystemUtils.printWithTime("Removed: " + this.queueArray.getFirst());
		this.queueArray.removeFirst();
	}

	/**
	 * Method to fetch the size of the queue
	 * @return - size of queue
	 */
	public int getSize() {
		return this.queueArray.size();
	}

	/**
	 * Method to determine if queue is empty
	 * @return true if empty
	 */
	public boolean isEmpty() {
		return this.queueArray.isEmpty();
	}

	/**
	 * Prints queue in a formatted way
	 */
	public void printQueue() {
		System.out.print("Queue { ");
		if (this.queueArray.size() > 0) {
			for (Object o : this.queueArray) {
				System.out.print(o + " ");
			}
		} else {
			System.out.print("{Empty queue} ");
		}
		System.out.print("}\n");
	}

	/**
	 * Empties the queue of all elements
	 */
	public void emptyQueue() {
		System.out.println("Emptying queue");
		this.queueArray.clear();
	}
	
}