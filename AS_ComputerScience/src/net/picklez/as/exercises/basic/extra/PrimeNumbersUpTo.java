package net.picklez.as.exercises.basic.extra;

import net.picklez.utils.MathUtils;

/**
 * @author Ben Pickering
 * @since 5 Nov 2015 | 11:53:51
 */

public class PrimeNumbersUpTo {

	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			if (MathUtils.isPrime(i)) {
				System.out.println(i);
			}
		}
	}
}