package net.picklez.as.exercises.arrays.sorting;

import net.picklez.utils.ArrayUtils;
import net.picklez.utils.Timer;

/**
 * @author Ben Pickering
 * @since 17 Nov 2015 | 09:32:47
 */

public class BubbleSort {

	public static void main(String[] args) {
		int[] array = new int[1000];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * array.length);
		}
		
		System.out.print("Before sorting: ");
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println("");
		
		Timer timer = new Timer();
		timer.setStartTime();
		array = ArrayUtils.bubbleSort(array);
		timer.setEndTime();
		
		long time = timer.getTimeElapsed();
		System.out.println("Took " + time + "ms to sort");
		
		System.out.print("After sorting: ");
		for (int i : array) {
			System.out.print(i + " ");
		}
	}
	
}