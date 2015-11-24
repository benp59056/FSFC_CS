package net.picklez.as.exercises.arrays.queues;

import net.picklez.utils.queues.Queue;

/**
 * @author Ben Pickering
 * @since 24 Nov 2015 | 10:21:02
 */

public class QueueExample {

	public static void main(String[] args) {
		Queue que = new Queue();
		que.addItem("Hello");
		que.addItem("Wagwan");
		que.printQueue();
		que.removeItem();
		que.printQueue();
	}
	
}