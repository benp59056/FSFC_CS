package net.picklez.as.exercises.arrays.queues;

/**
 * @author Ben Pickering
 * @since 20 Nov 2015 | 13:27:59
 */

public class QueueObject {
	
	int value;
	
	public QueueObject(int i) {
		value = i;
	}
	
	@Override
	public String toString() {
		return "" + value;
	}
}