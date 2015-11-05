package net.picklez.as.exercises;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Ben Pickering
 * @since 5 Nov 2015 | 11:39:49
 */

public class Anagram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Please input a word");
			String firstWord = scanner.nextLine();

			System.out.println("Please input a second word");
			String secondWord = scanner.nextLine();
			
			ArrayList<Character> wordOneChars = new ArrayList<Character>(); 
			ArrayList<Character> wordTwoChars = new ArrayList<Character>();
			
		} catch (InputMismatchException ime) {
			System.out.println("Error");
		}
		
		scanner.close();
	}
	
}
