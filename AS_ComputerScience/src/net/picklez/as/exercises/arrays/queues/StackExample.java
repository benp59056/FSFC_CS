package net.picklez.as.exercises.arrays.queues;

import net.picklez.utils.queues.Stack;

/**
 * @author Ben Pickering
 * @since 24 Nov 2015 | 10:01:19
 */

public class StackExample {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.pushItem("Hello");
		stack.pushItem("Wagwan");
		stack.printStack();
		stack.popFullStack();
		stack.printStack();
	}	
}