package net.picklez.as.exercises.arrays.sorting;

import net.picklez.utils.ArrayUtils;

/**
 * @author Ben Pickering
 * @since 19 Nov 2015 | 11:10:28
 */

public class LinearSearch {

	public static void main(String[] args) {
		int num = 5;
		
		System.out.println("Looking for number: " + num);
		
		int[] array = new int[1000];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * array.length);
		}
		
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println("");
		
		System.out.println(ArrayUtils.isNumInArray(array, num) ? "number was found in array" : "number was not present in array");
	}
	
}