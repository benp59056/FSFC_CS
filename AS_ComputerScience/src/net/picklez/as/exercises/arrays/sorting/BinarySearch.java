package net.picklez.as.exercises.arrays.sorting;

import net.picklez.utils.ArrayUtils;

/**
 * @author Ben Pickering
 * @since 19 Nov 2015 | 11:28:04
 */

public class BinarySearch {

	public static void main(String[] args) {
		int[] array = { 5, 12, 17, 23, 38, 44, 77, 84, 90 };
		
		System.out.println(ArrayUtils.binarySearch(array, 91));
	}
	
}