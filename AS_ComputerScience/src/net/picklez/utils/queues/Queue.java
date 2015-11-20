package net.picklez.utils.queues;

/**
 * @author Ben Pickering
 * @since 20 Nov 2015 | 13:11:31
 */

public class Queue {

	private int maxSize = 5;
	private Object[] objects;
	private int trueLength = 0;
	
	public Queue() {
		this.objects = new Object[this.maxSize];
	}

	public void addItem(Object o) {
		if (trueLength < maxSize) {
			this.objects[trueLength] = o;
			trueLength++;
		} else {
			boolean done = false;
			if (!done)
				System.out.println("Failed to add object: Array is at maximum size");
		}
	}
	
	public void removeFirst() {
		this.objects[0] = null;
		this.removeEmptySlots();
	}
	
	public int getSize() {
		return this.objects.length;
	}
	
	public boolean isEmpty() {
		return this.objects.length == 0;
	}
	
	public boolean isFull() {
		return this.objects.length == this.maxSize;
	}
	
	public void removeEmptySlots() {
		for (int i = 0; i < this.objects.length - 1; i++) {
			if (this.objects[i] == null) {
				this.objects[i] = this.objects[i+1];
				this.objects[i+1] = null;
			}
		}
	}
	
	public void printQueue() {
		int objsDone = 0;
		for (Object o : this.objects) {
			System.out.print((objsDone > 0 ? ", " : "") + o.toString());
			objsDone++;
		}
		System.out.print("\n");
	}
}