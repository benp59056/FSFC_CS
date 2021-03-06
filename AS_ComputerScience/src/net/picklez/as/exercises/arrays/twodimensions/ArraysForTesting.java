package net.picklez.as.exercises.arrays.twodimensions;

import net.picklez.utils.ArrayUtils;

/**
 * @author Ben Pickering
 * @since 13 Nov 2015 | 13:58:45
 */

public class ArraysForTesting {

	public static void main(String[] args) {
		int rows = 3;
		int columns = 5;
		int[][] array = new int[rows][columns];
		int numberRows = array.length;
		int numberColumns = array[0].length;
		
		System.out.println(numberRows + ", " + numberColumns);
		
		int cur = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				cur++;
				array[i][j] = cur;
			}
		}
		
		for (int i = 0; i < numberRows; i++) {
			for (int j = 0; j < numberColumns; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println("");
		}
		
		System.out.println("max: " + ArrayUtils.getHighestValue(array));
		System.out.println(ArrayUtils.rowSum(array, 0));
		System.out.println(ArrayUtils.columnSum(array, 5));
		
		
		System.out.println(ArrayUtils.isSequence(array));
	}
	
}