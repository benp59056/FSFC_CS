package net.picklez.as.exercises.arrays.twodimensions;

import net.picklez.utils.ArrayUtils;

/**
 * @author Ben Pickering
 * @since 13 Nov 2015 | 13:46:36
 */

public class MaximumValues {

	public static void main(String[] args) {
		int[][] values = new int[5][5];
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				values[i][j] = (i+1)*(j+1);
			}
		}
		
		for (int i = 0; i < values.length; i++) {
			for (int j = 0; j < values[0].length; j++) {
				System.out.print(values[i][j] + " ");
				if (j % 5 == 0)
					System.out.print("\n");
			}
		}
		
		System.out.println("Maximum value = " + ArrayUtils.getHighestValue(values));
	}
}