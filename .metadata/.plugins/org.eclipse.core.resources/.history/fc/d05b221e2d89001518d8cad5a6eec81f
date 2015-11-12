package net.picklez.as.exercises;

import java.util.Scanner;

import net.picklez.utils.StringUtils;

/**
 * @author Ben Pickering
 * @since 16 Oct 2015 | 13:33:19
 */

public class TestResults {
	
	public static void main(String[] args) {
		System.out.println("Enter percentage");
		Scanner scanner = new Scanner(System.in);
		float percentage = scanner.nextFloat();
		
		System.out.println(StringUtils.formatString("Grade received from {0}%: {1}", percentage, getGradeFromPercentage(percentage)));
	}
	
	public static char getGradeFromPercentage(float p) {
		if (p >= 90)
			return 'A';
		
		if (p >= 70 && p < 90)
			return 'B';
		
		if (p >= 50 && p < 70)
			return 'C';
		
		return 'F';
	}

}
