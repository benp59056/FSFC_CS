package net.picklez.as.exercises.linkedlists.stack;

/**
 * @author Ben Pickering
 * @since 27 Nov 2015 | 13:14:45
 */

public class StackController {

	public static void main(String[] args) {
		LinkedListStack stack = new LinkedListStack();
		stack.addItemToStack("hello");
		stack.addItemToStack("Wagwan");
		stack.addItemToStack("Yo");
		stack.printStack();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.printStack();
	}
	
}