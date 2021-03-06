package net.picklez.as.exercises.arrays;

import net.picklez.utils.ArrayUtils;

import java.util.Scanner;
/**
 * @author Ben Pickering
 * @since 12 Nov 2015 | 11:05:57
 */

public class ReversingArrays {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int length = 10;
		String[] original = new String[length];
		for (int i = 0; i < length; i++) {
			System.out.println("Please input next string");
			original[i] = scanner.nextLine();
		}
		String[] reversed = ArrayUtils.reverseArray(original);
		
		for (String s : reversed) {
			System.out.println(s);
		}
		scanner.close();
	}
	
}