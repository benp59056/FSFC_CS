package net.picklez.as.exercises.basic;

import java.util.Scanner;

import net.picklez.utils.StringUtils;

/**
 * @author Ben Pickering
 * @since 16 Oct 2015 | 14:07:24
 */

public class WhileLoops {

	public static void main(String[] args) {
		int age = 0;
		Scanner scanner = new Scanner(System.in);
		
		while (age < 999) {
			System.out.println("Enter your age");
			age = scanner.nextInt();
 			if (age < 999) {
				System.out.println(StringUtils.formatString("Congratulations on being {0}!", age));
			} else {
				System.out.println(StringUtils.formatString("{0} is not a valid age.", age));
			}
		}
		
		scanner.close();
	}
	
}
