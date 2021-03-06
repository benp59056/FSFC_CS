package net.picklez.utils;

/**
 * @author Ben Pickering
 * @since 16 Oct 2015 | 13:32:33
 * Class to hold essential maths-related methods
 */

public class MathUtils {

	/**
	 * Checks if a number is even
	 * @param num - number to check
	 * @return true if even
	 */
	public static boolean isEven(int num) {
		return num % 2 == 0;
	}

	/**
	 * Checks if a number is a prime
	 * @param num - number to check
	 * @return true if prime
	 */
	public static boolean isPrime(int num) {
		if (num % 2 == 0)
			return false;

		if (Math.sqrt(num) == Math.floor(Math.sqrt(num)))
			return false;

		if (Math.cbrt(num) == Math.floor(Math.cbrt(num)))
			return false;

		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				return false;
		}

		return true;
	}

	/**
	 * Method to find the average of given number set
	 * @param numbers
	 * @return - the average of the given numbers
	 */
	public static float averageOf(float... numbers) {
		float sum = 0;

		for (float f : numbers) {
			sum += f;
		}

		return sum / numbers.length;
	}

	/**
	 * A method to get the factorial of a number
	 * @param num
	 * @return the factorial of first parameter
	 */
	public static int factorialOf(int num) {
		int fac = 0;
		for (int i = 1; i <= num; i++) {
			if (fac == 0)
				fac = i;
			else
				fac *= i;
		}
		return fac;
	}

	/**
	 * Converts a String from binary to an integer
	 * @param s
	 * @return - 0 if conversion fails
	 */
	public static int convertFromBinary(String s) {
		if (s.matches("^[0-1]+$")) {
			int result = 0;
			int index = s.length();
			for (char c : s.toCharArray()) {
				if (c == '1') {
					result += Math.pow(2, index-1);
				}
				index--;
			}
			return result;
		}

		return 0;
	}
}
