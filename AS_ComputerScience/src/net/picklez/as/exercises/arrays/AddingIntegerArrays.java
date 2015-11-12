package net.picklez.as.exercises.arrays;

/**
 * @author Ben Pickering
 * @since 12 Nov 2015 | 11:23:14
 */

public class AddingIntegerArrays {

	public static void main(String[] args) {
		int[] firstSet = { 1, 2, 3, 4, 5 };
		int[] secondSet = { 1, 2, 3, 4, 5 };
		
		int length = firstSet.length;
		if (firstSet.length > secondSet.length) length = secondSet.length;
		
		int[] results = new int[length];
		
		for (int i = 0; i < length; i++) {
			results[i] = firstSet[i] + secondSet[i];
		}
		
		for (int i : results) {
			System.out.println(i);
		}
	}
	
}