package net.picklez.as.exercises.basic.extra;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Ben Pickering
 * @since 5 Nov 2015 | 11:23:31
 */

public class Pallindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input a string");
		try {
			String input = scanner.nextLine();
			
			if (input.equals(reverseString(input))) {
				System.out.println(input + " is a pallindrome");
			} else {
				System.out.println(input + " is not a pallindrome");
			}
		
		} catch (InputMismatchException ime) {
			System.out.println("Your input could not be processed");
		}
		
		scanner.close();
	}
	
	static String reverseString(String s) {
		String result = "";
		
		for (char c : s.toCharArray()) {
			result = c + result;
		}
		
		return result;
	}
	
}
