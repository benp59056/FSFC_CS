package net.picklez.as.exercises.arrays;

import net.picklez.utils.ArrayUtils;

/**
 * @author Ben Pickering
 * @since 12 Nov 2015 | 11:21:20
 */

public class PushingIntegerArrays {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int shift = 8;
		
		int[] shifted = ArrayUtils.pushData(numbers, shift);
		
		for (int i : shifted) {
			System.out.println(i);
		}
	}
	
}