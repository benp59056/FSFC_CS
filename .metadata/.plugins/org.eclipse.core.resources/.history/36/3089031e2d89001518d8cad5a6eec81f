package net.picklez.as.exercises;

import java.util.Scanner;

/**
 * @author Ben Pickering
 * @since 3 Nov 2015 | 09:23:22
 */

public class IQs {

	public static void main(String[] args) {
		System.out.println("Please enter your iq");
		Scanner scanner = new Scanner(System.in);
		
		try {
			int iq = scanner.nextInt();
		
			if (iq < 50 || iq > 200)
				System.out.println("Your iq is not that low/high");
			else
				System.out.println("Your iq is: " + iq);
		} catch (java.util.InputMismatchException e) {
			System.out.println("Incorrect iput. Closing");
		}
	}
	
}