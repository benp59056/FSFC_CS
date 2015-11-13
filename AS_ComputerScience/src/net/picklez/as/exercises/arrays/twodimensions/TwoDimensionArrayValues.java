package net.picklez.as.exercises.arrays.twodimensions;

import net.picklez.utils.ArrayUtils;

/**
 * @author Ben Pickering
 * @since 13 Nov 2015 | 13:11:17
 */

public class TwoDimensionArrayValues {

	public static void main(String[] args) {
		int[] array = { 16, 22, 99, 4, 18,
						-2, 4, 103, 5, 95, 
						117, 6, 15, 2, 45,
						-33, 45, 87, 77, 12
					  };
		int[][] array2D = new int[4][5];

		int curVal = 0;
		for (int i = 0; i < array.length / 5; i++) {
			for (int j = 0; j < array.length / 4; j++) {
				array2D[i][j] = curVal;
				curVal++;
			}
		}
		
		System.out.println(ArrayUtils.getHighestValue(array));
		System.out.println(getMaxValue(array2D));
	}
	
	private static int getMaxValue(int[][] array) {
		int result = 0;
		System.out.println("Length of 0 = " + array[0].length);
		System.out.println("Length of 1 = " + array[1].length);
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("i = " + i);
			for (int j = 0; j < array[i].length; j++) {
				System.out.println("j = " + j);
				if (array[i][j] > result)
					result = array[i][j];
			}
		}
		
		return result;
	}
}