package net.picklez.as.exercises;

import net.picklez.utils.StringUtils;

/**
 * @author Ben Pickering
 */

public class AddTwoNumbers {
	
	public static void main(String[] args) {
		int numOne, numTwo;

		try {
			numOne = Integer.parseInt(args[0]);
			numTwo = Integer.parseInt(args[1]);
		} catch (ArrayIndexOutOfBoundsException exc) {
			exc.printStackTrace();
			numOne = 0;
			numTwo = 0;
		}
		
		System.out.println(StringUtils.formatString("The sum of {0} and {1} = {2}", numOne, numTwo, numOne+numTwo));
	}
}