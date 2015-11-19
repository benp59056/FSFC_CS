package net.picklez.as.exercises.arrays.sorting;

import net.picklez.utils.ArrayUtils;
import net.picklez.utils.Timer;

/**
 * @author Ben Pickering
 * @since 19 Nov 2015 | 12:08:17
 */

public class LinearAgainstBinary {

	public static void main(String[] args) {
		int[] array = new int[1000];
		
		int searchNum = 1200;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * array.length);
		}
		
		array = ArrayUtils.insertionSort(array);
		
		Timer linearTimer = new Timer();
		linearTimer.setStartTime();
		for (int i : array) {
			if (i == searchNum) {
				break;
			}
		}
		linearTimer.setEndTime();
		System.out.println("Linear: " + linearTimer.getTimeElapsed());
		
		Timer binaryTimer = new Timer();
		binaryTimer.setStartTime();
		
		binaryTimer.setEndTime();
	}
	
}