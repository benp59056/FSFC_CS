package net.picklez.as.exercises.basic;

import java.util.Scanner;

import net.picklez.utils.StringUtils;

/**
 * @author Ben Pickering
 * @since 3 Nov 2015 | 09:27:49
 */

public class NumberGuessing {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int number = (int)Math.floor(Math.random() * 100);
		int attempts = 0;
		
		boolean running = true;
		boolean correct = false;
		
		while (!correct && running) {
			try {
				System.out.println("Please enter a guess");
				int guess = scanner.nextInt();
				attempts++;
				
				if (guess != number) {
					if (guess > number) {
						System.out.println("Too high");
					} else if (guess < number) {
						System.out.println("Too low");
					}
				} else {
					correct = true;
				}
			} catch (java.util.InputMismatchException e) {
				System.out.println("\nYour input was in an incorrect format");
				running = false;
			}
		}
		
		if (correct) {
			System.out.println(StringUtils.formatString("You were correct in {0} attempts. The answer was {1}.", attempts, number));
		}
		System.out.println("Closing.");
		scanner.close();
	}
	
}
