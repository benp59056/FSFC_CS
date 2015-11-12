package net.picklez.as.exercises.basic;

/**
 * @author Ben Pickering
 * @since 20 Oct 2015 | 09:16:52
 */

public class SquareNumbers {

	public static void main(String[] args) {
		int max = 100;
		
		for (int i = 1; i < max; i++) {
			int sum = i * i;
			
			if (sum < max)
				System.out.println(sum);
			else
				break;
		}
	}
	
}
