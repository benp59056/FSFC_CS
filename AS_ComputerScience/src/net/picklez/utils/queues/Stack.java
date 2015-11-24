package net.picklez.utils.queues;

import java.util.LinkedList;

import net.picklez.utils.SystemUtils;

/**
 * @author Ben Pickering
 * @since 24 Nov 2015 | 09:49:02
 * @description - Last in; first out
 */
public class Stack {

	private LinkedList<Object> stackArray;

	public Stack() {
		this.stackArray = new LinkedList<Object>();
	}

	public void pushItem(Object o) {
		this.stackArray.addFirst(o);
	}

	public void popItem() {
		SystemUtils.printWithTime("Removed: " + this.stackArray.getFirst());
		this.stackArray.removeFirst();
	}

	public int getSize() {
		return this.stackArray.size();
	}

	public boolean isEmpty() {
		return this.stackArray.size() == 0;
	}

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

	public void popFullStack() {
		System.out.println("Popping full stack");
		this.stackArray.clear();
	}
}