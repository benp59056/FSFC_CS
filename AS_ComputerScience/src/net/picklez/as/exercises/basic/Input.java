package net.picklez.as.exercises.basic;

import java.util.Scanner;

/**
 * @author Ben Pickering
 * @since 16 Oct 2015 | 14:17:41
 */

public class Input {

	private static int age = 0;
	private static Scanner s;
	
	private static int currentTry = 0;
	
	public static void main(String[] args) {
		s = new Scanner(System.in);
		takeInput(currentTry);
	}
	
	private static void takeInput(int i) {
		try {
			age = s.nextInt();
			checkInput();
		} catch (Exception e) {
			System.out.println("Input was not acceptable; try again");
			currentTry++;
			takeInput(currentTry);
		}
	}
	
	private static void checkInput() {
		try {
			if (age < 10) {
				System.out.println("age is not bigger than 10");
			} else {
				System.out.println("age is " + age);
			}
		} catch (Exception e) {
			System.out.println("Input was not acceptable; try again");
			currentTry++;
			takeInput(currentTry);
		}
	}
}