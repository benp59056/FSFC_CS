package net.picklez.utils;

/**
 * @author Ben Pickering
 * @since 16 Oct 2015 | 13:32:33
 */

public class MathUtils {

	public static boolean isEven(int num) {
		return num % 2 == 0;
	}

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

	public static float averageOf(float... numbers) {
		float sum = 0;

		for (float f : numbers) {
			sum += f;
		}

		return sum / numbers.length;
	}

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
