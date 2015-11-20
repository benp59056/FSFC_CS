package net.picklez.as.exercises.arrays.queues;

import net.picklez.utils.queues.Queue;

/**
 * @author Ben Pickering
 * @since 20 Nov 2015 | 13:23:18
 */

public class ArrayQueue {

	public static void main(String[] args) {
		Queue qu = new Queue();
		
		for (int i = 0; i < 6; i++) {
			qu.addItem(new QueueObject(i));
		}
		qu.printQueue();
		qu.removeFirst();
		qu.removeEmptySlots();
		qu.printQueue();
	}
	
	
}