package net.picklez.as.exercises.basic.triangle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		/** Create a program to produce the following output:
		 * 1
		 * 2 3
		 * 4 5 6
		 * 7 8 9 10
		 * 11 12 13 14
		 * 15 16 17 18 19
		 * 20 21 22 23 24 25
		 */
		Scanner scanner = new Scanner(System.in);
		int numRows = 3;
		
		try {
			System.out.println("Please input a number of rows");
			numRows = scanner.nextInt();
		} catch (NumberFormatException nfe) {
			System.out.println("Input could not be parsed, using " + numRows + " by default");
		} catch (InputMismatchException ime) {
			System.out.println("Input could not be parsed, using " + numRows + " by default");
		}
		
		if (numRows < 1) {
			System.out.println("Input could not be parsed, using 3 by default");
			numRows = 3;
		}
			
		Triangle tri = new Triangle(numRows);
		tri.print();
		
		scanner.close();
	}
	
}