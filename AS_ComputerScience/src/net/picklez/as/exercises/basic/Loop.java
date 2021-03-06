package net.picklez.as.exercises.basic;

/**
 * @author Ben Pickering
 * @since 15 Oct 2015
 */

public class Loop {

	public static void main(String[] args) {
		int var = 10;
		
		System.out.println("--- Checking if " + var + " is less than or equal to 0 ---");
		
		if (var <= 0) {
			System.out.println(var + " is less than or equal to 0");
		} else {
			System.out.println(var + " is more than 0");
		}
		
		System.out.println("--- For-loop from 0-50, checking for greater than 30 ---");
		
		//Will run until i = 50
		for (int i = 0; i < 50; i++) {
			if (i > 30) {
				System.out.println(i + " is bigger than 30");
			}
		}
		
		char result = 'i';
		
		System.out.println("--- Getting feedback from test result '" + result + "' ---");
		
		switch(result) {
			case 'a':
				System.out.println("Highest mark.");
				break;
			case 'b':
				System.out.println("Could've done better");
				break;
			case 'c':
				System.out.println("Just passed");
				break;
			case 'd':
				System.out.println("Failed");
				break;
			case 'u':
				System.out.println("Not legible");
				break;
			default:
				System.out.println("Invalid selection");
				break;
		}
	}
}