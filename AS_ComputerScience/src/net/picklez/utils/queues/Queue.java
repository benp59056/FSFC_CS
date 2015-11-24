package net.picklez.utils.queues;

import java.util.LinkedList;

import net.picklez.utils.SystemUtils;

/**
 * @author Ben Pickering
 * @since 24 Nov 2015 | 10:18:34
 * @description - First in; first out
 */

public class Queue {

	private LinkedList<Object> queueArray;

	public Queue() {
		this.queueArray = new LinkedList<Object>();
	}

	public void addItem(Object o) {
		this.queueArray.addLast(o);
	}

	public void removeItem() {
		SystemUtils.printWithTime("Removed: " + this.queueArray.getFirst());
		this.queueArray.removeFirst();
	}

	public int getSize() {
		return this.queueArray.size();
	}

	public boolean isEmpty() {
		return this.queueArray.isEmpty();
	}

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

	public void emptyQueue() {
		System.out.println("Emptying queue");
		this.queueArray.clear();
	}
	
}