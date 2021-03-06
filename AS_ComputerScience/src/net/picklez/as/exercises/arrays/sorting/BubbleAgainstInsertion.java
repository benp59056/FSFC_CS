package net.picklez.as.exercises.arrays.sorting;

import net.picklez.utils.ArrayUtils;
import net.picklez.utils.Timer;

/**
 * @author Ben Pickering
 * @since 19 Nov 2015 | 11:14:27
 */

public class BubbleAgainstInsertion {

	public static void main(String[] args) {
		int length = 1000;
		int[] bubbleArray = new int[length];
		int[] insertionArray = new int[length];
		
		for (int i = 0; i < length; i++) {
			int num = (int)(Math.random() * length);
			bubbleArray[i] = num;
			insertionArray[i] = num;
		}
		
		System.out.println("Sleeping 500ms before initial sort");
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			
		}
		
		System.out.print("Bubble: Before sorting: ");
		for (int i : bubbleArray) {
			System.out.print(i + " ");
		}
		System.out.println("");
		
		Timer bubbleTimer = new Timer();
		bubbleTimer.setStartTime();
		bubbleArray = ArrayUtils.bubbleSort(bubbleArray);
		bubbleTimer.setEndTime();
		
		System.out.println("Took " + bubbleTimer.getTimeElapsed() + "ms to sort");
		
		System.out.print("Bubble: After sorting: ");
		for (int i : bubbleArray) {
			System.out.print(i + " ");
		}
		
		/**
		 ********************************************************** 
		 */
		
		System.out.println("\nSleeping 500ms before next sort");
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			
		}
		
		System.out.print("Insertion: Before sorting: ");
		for (int i : insertionArray) {
			System.out.print(i + " ");
		}
		System.out.println("");
		
		Timer insertionTimer = new Timer();
		insertionTimer.setStartTime();
		insertionArray = ArrayUtils.insertionSort(insertionArray);
		insertionTimer.setEndTime();
		
		System.out.println("Took " + insertionTimer.getTimeElapsed() + "ms to sort");
		
		System.out.print("Insertion: After sorting: ");
		for (int i : insertionArray) {
			System.out.print(i + " ");
		}
		
		if (insertionTimer.getTimeElapsed() < bubbleTimer.getTimeElapsed()) {
			System.out.println("\nInsertion sorting was " + (bubbleTimer.getTimeElapsed() - insertionTimer.getTimeElapsed()) + "ms faster");
		}
	}
	
}