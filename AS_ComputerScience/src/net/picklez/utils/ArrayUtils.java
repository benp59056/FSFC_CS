package net.picklez.utils;

import net.picklez.utils.vectors.Vector2I;

/**
 * @author Ben Pickering
 * @since 12 Nov 2015 | 11:16:55
 */

public class ArrayUtils {

	private ArrayUtils() {
		
	}
	
	public static String[] reverseArray(String[] array) {
		String[] result = new String[array.length];
		
		for (int i = 0; i < array.length; i++) {
			result[array.length - i - 1] = array[i];
		}
		
		return result;
	}
	
	public static int[] reverseArray(int[] array) {
		int[] result = new int[array.length];
		
		for (int i = 0; i < array.length; i++) {
			result[array.length - i - 1] = array[i];
		}
		
		return result;
	}
	
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
	
	public static int getHighestValue(int[] array) {
		int localHighest = Integer.MIN_VALUE;
		
		for (int i : array) {
			if (i > localHighest) 
				localHighest = i;
		}
		
		return localHighest;
	}
	
	public static int getLowestValue(int[] array) {
		int localLowest = Integer.MAX_VALUE;
		
		for (int i : array) {
			if (i < localLowest) 
				localLowest = i;
		}
		
		return localLowest;
	}
	
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
}