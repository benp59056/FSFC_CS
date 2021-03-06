package net.picklez.as.exercises.arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

import net.picklez.utils.exceptions.CustomException;

/**
 * @author Ben Pickering
 * @since 12 Nov 2015 | 11:40:41
 */

public class SearchingArrays {

	public static void main(String[] args) {
		/**
		 * 1. Ask user for an index from 1 to 10 and display the number stored there
		 * 2. Ask the user for a number and find the index where it is stored
		 * 3. Improve part 2 so that a message is shown if the number does not exist
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Please input an index from 1-10");
			int num = scanner.nextInt();
			
			if (num > 10 || num < 1) {
				scanner.close();
				throw new CustomException("Number did not meet criteria");
			}
			
		} catch (InputMismatchException | NumberFormatException e) {
			System.out.println("Your input could not be parsed:");
			e.printStackTrace();
		} catch (CustomException ce) {
			System.out.println(ce.getMessage());
		}
		
		scanner.close();
	}
	
}