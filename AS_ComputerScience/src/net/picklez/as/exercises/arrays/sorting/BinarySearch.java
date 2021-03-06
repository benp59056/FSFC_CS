package net.picklez.as.exercises.arrays.sorting;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.NumberFormatException;

import net.picklez.utils.ArrayUtils;

/**
 * @author Ben Pickering
 * @since 19 Nov 2015 | 11:28:04
 */

public class BinarySearch {

	public static void main(String[] args) {
		int num = 1000;
		int[] array = new int[num];
		
		for (int i = 0; i < num; i++) {
			array[i] = (int)(Math.random() * num);
			System.out.print(array[i] + " ");
		}
		System.out.print("\n");
		
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Input num to search:");
			int number = scanner.nextInt();
			System.out.println(ArrayUtils.binarySearchAndSort(array, number));
		} catch (NumberFormatException | InputMismatchException e) {
			
		}
		scanner.close();
	}
	
}