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
}
