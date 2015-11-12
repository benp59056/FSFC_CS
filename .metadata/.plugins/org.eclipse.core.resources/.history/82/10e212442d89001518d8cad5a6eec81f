package net.picklez.as.exercises;

import java.util.Scanner;

import net.picklez.utils.MathUtils;
import net.picklez.utils.StringUtils;

/**
 * @author Ben Pickering
 * @since 20 Oct 2015 | 09:25:55
 */

public class Primes {
	
	static int num;
	
	public static void main(String[] args) {
		System.out.println("Enter number");
		try {
			Scanner input = new Scanner(System.in);

			num = input.nextInt();
			System.out.println(StringUtils.formatString("Is {0} a prime? {1}", num, MathUtils.isPrime(num)));
		}catch (java.util.InputMismatchException ime) {
			System.out.println("Could not use input");
		}
	}

}
