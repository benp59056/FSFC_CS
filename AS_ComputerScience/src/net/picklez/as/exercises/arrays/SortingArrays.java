package net.picklez.as.exercises.arrays;

import net.picklez.utils.ArrayUtils;

/**
 * @author Ben Pickering
 * @since 12 Nov 2015 | 11:30:05
 */

public class SortingArrays {

	public static void main(String[] args) {
		int[] array = { 5, 8, 2, 1, 10 };
		int[] sorted = ArrayUtils.sortAscendingValue(array);
		
		for (int i : sorted) 
			System.out.println(i);
	}

}