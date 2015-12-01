package net.picklez.as.exercises.linkedlists.queue;

/**
 * @author Ben Pickering
 * @since 27 Nov 2015 | 13:32:55
 */

public class QueueController {

	public static void main(String[] args) {
		LinkedListQueue q = new LinkedListQueue();
		q.addItemToQueue("Hello");
		q.addItemToQueue("Wagwan");
		q.addItemToQueue("Yo");
		q.printQueue();
		q.removeFirst();
		q.printQueue();
	}
	
}