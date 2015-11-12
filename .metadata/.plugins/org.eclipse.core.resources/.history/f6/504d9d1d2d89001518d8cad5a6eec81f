package net.picklez.as.exercises;

import java.util.Scanner;

import net.picklez.utils.StringUtils;

/**
 * @author Ben Pickering
 * @since 20 Oct 2015 | 09:06:56
 */

public class MultiplicationTables {

	static int num = 12;

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Enter number");
		try {
			Scanner input = new Scanner(System.in);

			num = input.nextInt();
		}catch (java.util.InputMismatchException ime) {
			System.out.println("Error processing input, using 12 by default");
			num = 12;
		}

		for (int i = 1; i <= 12; i++) {
			System.out.println(StringUtils.formatString("{0} * {1} = {2}", i, num, i*num));
		}
	}



}
