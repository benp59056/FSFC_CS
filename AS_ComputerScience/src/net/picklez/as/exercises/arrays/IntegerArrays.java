package net.picklez.as.exercises.arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

import net.picklez.utils.ArrayUtils;

/**
 * @author Ben Pickering
 * @since 12 Nov 2015 | 11:13:12
 */

public class IntegerArrays {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int length = 10;
		int[] numbers = new int[length];

		try {
			for (int i = 0; i < length; i++) {
				System.out.println("Please enter a number");
				numbers[i] = scanner.nextInt();
			}
			int[] reversed = ArrayUtils.reverseArray(numbers);
			
			for (int i : reversed) {
				System.out.println(i);
			}
			
		}catch (NumberFormatException | InputMismatchException e) {
			System.out.println("An error occurred whilst parsing input; printing stack trace");
			e.printStackTrace();
		}

		scanner.close();
	}

}