package net.picklez.utils;

import net.picklez.utils.vectors.Vector2I;

/**
 * @author Ben Pickering
 * @since 12 Nov 2015 | 11:16:55
 * Class holding utility methods for arrays
 */

public class ArrayUtils {

	private ArrayUtils() {
		/**
		 * Private constructor so that the class cannot be instantiated -- as it
		 * is not intended to do so -- all methods should be globally accessible
		 */
	}

	/**
	 * Reverses a string array
	 * @param array 
	 * @return - reversed string array
	 */
	public static String[] reverseArray(String[] array) {
		String[] result = new String[array.length];

		for (int i = 0; i < array.length; i++) {
			result[array.length - i - 1] = array[i];
		}

		return result;
	}

	/**
	 * Reverses an integer array
	 * @param array - original array
	 * @return - integer array in reverse
	 */
	public static int[] reverseArray(int[] array) {
		int[] result = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			result[array.length - i - 1] = array[i];
		}

		return result;
	}

	/**
	 * A method to push values of an integer array x places 
	 * @param array - original array
	 * @param places - number of places to push data
	 * @return - new array with data pushed x places
	 */
	public static int[] pushData(int[] array, int places) {
		int[] result = new int[array.length+places];

		for (int i = 0; i < places; i++) {
			result[i] = 0;
		}

		for (int i = 0; i < array.length; i++) {
			result[i + places] = array[i];
		}

		return result;
	}

	/**
	 * A somewhat-easy to understand method of sorting an integer array
	 * @param array - original array
	 * @return - new array in ascending order
	 */
	public static int[] sortAscendingValue(int[] array) {
		int[] localArray = array;
		int[] result = new int[array.length];

		for (int i = 0; i < localArray.length; i++) {
			Vector2I lowest = getLowestValueAndPosition(localArray);
			result[i] = lowest.getX();
			localArray[lowest.getY()] = Integer.MAX_VALUE;
		}

		return result;
	}

	/**
	 * A somewhat-easy to understand method of sorting an integer array
	 * @param array - original array
	 * @return - new array in descending order
	 */
	public static int[] sortDescendingValue(int[] array) {
		int[] localArray = array;
		int[] result = new int[array.length];

		for (int i = 0; i < localArray.length; i++) {
			Vector2I highest = getHighestValueAndPosition(localArray);
			result[i] = highest.getX();
			localArray[highest.getY()] = Integer.MIN_VALUE;
		}

		return result;
	}

	/**
	 * Method to find highest value in an integer array
	 * @param array
	 * @return - the highest value of the array
	 */
	public static int getHighestValue(int[] array) {
		int localHighest = Integer.MIN_VALUE;

		for (int i : array) {
			if (i > localHighest) 
				localHighest = i;
		}

		return localHighest;
	}
	
	/**
	 * Method to find lowest value in an integer array
	 * @param array
	 * @return - the lowest value of the array
	 */
	public static int getLowestValue(int[] array) {
		int localLowest = Integer.MAX_VALUE;

		for (int i : array) {
			if (i < localLowest) 
				localLowest = i;
		}

		return localLowest;
	}

	/**
	 * Method to find the lowest value and its index in the array
	 * @param array
	 * @return - returns net.picklez.utils.vectors.Vector2I with:
	 * x = lowest value, y = position in array
	 */
	public static Vector2I getLowestValueAndPosition(int[] array) {
		int localLowest = Integer.MAX_VALUE;
		int lowestPosition = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] < localLowest) { 
				localLowest = array[i];
				lowestPosition = i;
			}
		}

		return new Vector2I(localLowest, lowestPosition);
	}

	/**
	 * Method to find the highest value and its index in the array
	 * @param array
	 * @return - returns net.picklez.utils.vectors.Vector2I with:
	 * x = highest value, y = position in array
	 */
	public static Vector2I getHighestValueAndPosition(int[] array) {
		int localHighest = Integer.MIN_VALUE;
		int highestPosition = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > localHighest) { 
				localHighest = array[i];
				highestPosition = i;
			}
		}

		return new Vector2I(localHighest, highestPosition);
	}

	/**
	 * Finds the highest value in a 2d integer array
	 * @param array
	 * @return - the highest value found
	 */
	public static int getHighestValue(int[][] array) {
		int result = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] > result)
					result = array[i][j];
			}
		}

		return result;
	}

	/**
	 * Method to show the sum of given row in 2d integer array
	 * @param array
	 * @param rowNum - row index
	 * @return - the sum of the row stated in given array
	 */
	public static int rowSum(int[][] array, int rowNum) {
		int sum = 0;

		if (rowNum > array[0].length) 
			return Integer.MIN_VALUE;

		for (int i = 0; i < array[rowNum].length; i++) {
			sum += array[rowNum][i];
		}

		return sum;
	}

	/**
	 * Method to show the sum of given column in 2d integer array
	 * @param array
	 * @param columnNum - column index
	 * @return - the sum of the column stated in given array
	 */
	public static int columnSum(int[][] array, int columnNum) {
		int sum = 0;

		if (columnNum > array.length) 
			return Integer.MIN_VALUE;

		for (int i = 0; i < array.length; i++) {
			sum += array[i][columnNum];
		}

		return sum;
	}

	/**
	 * Checks if a 2d integer array is of sequence (2*2, 3*3, etc...)
	 * @param array
	 * @return
	 */
	public static boolean isSequence(int[][] array) {
		if (array[0].length == array.length)
			return true;

		return false;
	}

	/**
	 * This array sorting algorithm loops through (length-1^2) times
	 * @param array -- array to be sorted
	 * @return -- array sorted in ascending order
	 */
	public static int[] bubbleSort(int[] array) {
		if (array.length < 2) 
			return array;

		for (int i = 0; i < array.length - 1; i++) {
			boolean changed = false;
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					changed = true;
				}
			}
			if (!changed)
				break;
		}

		return array;
	}

	/**
	 * "Loop forwards from position 2 to the end of the array.
	 * Loop backwards from the current position moving the
	 * number left till it reaches the right place"
	 * @param array -- array to be sorted
	 * @return -- array sorted in ascending order
	 */
	public static int[] insertionSort(int[] array) {
		int curPos = 0;

		for (curPos = 1; curPos < array.length; curPos++) {
			while (curPos > 0 && array[curPos] < array[curPos-1]) {
				int temp = array[curPos];
				array[curPos] = array[curPos-1];
				array[curPos-1] = temp;
				curPos--;
			}
		}

		return array;
	}

	/**
	 * Checks if a number is in an integer array
	 * @param array
	 * @param num - number to find
	 * @return true if found
	 */
	public static boolean isNumInArray(int[] array, int num) {
		for (int i : array) {
			if (i == num)
				return true;
		}
		return false;
	}

	/**
	 * Performs a binary search to find a value in an integer array
	 * @param array
	 * @param num - number to find
	 * @return - true if found
	 */
	public static boolean binarySearch(int[] array, int num) {
		int midPoint = (int) Math.floor(array.length / 2);

		if (array[midPoint] == num)
			return true;

		int curPos = midPoint;
		
		if (array[midPoint] > num) {
			
			while (array[curPos] > num && curPos > 0) {
				curPos--;
			}
			
			if (array[curPos] == num)
				return true;
			else if (array[curPos] < num)
				return false;
			
		} else if (array[midPoint] < num) {
			
			while(array[curPos] < num && curPos < array.length - 1) {
				curPos++;
			}

			if (array[curPos] == num)
				return true;
			else if (array[curPos] > num)
				return false;
			
		}

		return false;
	}
	
	/**
	 * Method to first sort the array and then use the given binarySearch method
	 * @param array
	 * @param num - number to find in array
	 * @return - true if found
	 */
	public static boolean binarySearchAndSort(int[] array, int num) {
		array = insertionSort(array);
		return binarySearch(array, num);
	}
}