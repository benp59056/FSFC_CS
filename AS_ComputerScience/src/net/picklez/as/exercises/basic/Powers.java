package net.picklez.as.exercises.basic;

import java.util.Scanner;

import net.picklez.utils.StringUtils;

/**
 * @author Ben Pickering
 * @since 20 Oct 2015 | 09:19:03
 */

public class Powers {

	static int num = 1;
	static int pow = 2;
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Enter number");
		try {
			Scanner input = new Scanner(System.in);

			num = input.nextInt();
			System.out.println("Enter power");
			pow = input.nextInt();
		}catch (java.util.InputMismatchException ime) {
			System.out.println("Error processing input, using num=1 and pow=2 by default");
			num = 1;
			pow = 2;
		}
		
		System.out.println(StringUtils.formatString("{0}^{1} = {2}", num, pow, (int)Math.pow(num, pow)));
	}
	
}
