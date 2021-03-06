package net.picklez.as.exercises.basic.extra;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Ben Pickering
 * @since 5 Nov 2015 | 11:01:26
 */

public class ArmstrongNumbers {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input your number");
		try {
			String numAsString = scanner.nextLine();
			int num = Integer.parseInt(numAsString);
			
			int result = 0;

			for (char c : numAsString.toCharArray()) {
				int i = Integer.parseInt(c + "");
				result += Math.pow(i, 3);
			}
			
			if (num == result) {
				System.out.println(num + " is an Armstrong number");
			} else {
				System.out.println(num + " is not an Armstrong number");
			}
			
		} catch (NumberFormatException nfe) {
			System.out.println("Unable to parse input");
		} catch (InputMismatchException ime) {
			System.out.println("Unable to parse input");
		}
		
		scanner.close();
	}	
}