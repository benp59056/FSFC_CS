package net.picklez.as.exercises.basic;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Ben Pickering
 * @since 3 Nov 2015 | 09:42:21
 */

public class Dates {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a date in dd/mm/yyyy format");
		boolean correct = true;
		
		try {
			String s = scanner.nextLine();

			int day = Integer.parseInt(s.split("/")[0].toString());
			int month = Integer.parseInt(s.split("/")[1].toString());
			//int year = Integer.parseInt(s.split("/")[2].toString());

			if (day == 0 || month == 0) {
				System.out.println("Days or months cannot be 0");
				correct = false;
			}
			
			if (day > 31) {
				System.out.println("The day of a month cannot be over 31");
				correct = false;
			}
			if (month > 12) {
				System.out.println("The month cannot be over 12");
				correct = false;
			}
			
			if (correct)
				System.out.println("That is a correct date");
			
		} catch (InputMismatchException e) {
			System.out.println("There was a problem parsing the input.");
		} catch (NumberFormatException ne) {
			System.out.println("There was a problem parsing your input");
		} catch (ArrayIndexOutOfBoundsException oob) {
			System.out.println("There was a problem parsing your input");
		}
		
		scanner.close();
	}
	
}
