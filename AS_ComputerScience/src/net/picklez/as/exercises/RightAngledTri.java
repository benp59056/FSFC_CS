package net.picklez.as.exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Ben Pickering
 * @since 3 Nov 2015 | 09:52:13
 */

public class RightAngledTri {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numRows = 3;
		
		try {
			
			int curRow = 1;
			int curRowLength = 0;
			
			String row = "";
			
			for (int i = 0; i < 100; i++) {
				if (curRowLength == curRow) {
					curRow++;
				}
			}
			
			
		} catch (InputMismatchException e) {
			System.out.println("Failed to use input, using 3.");
		} catch (NumberFormatException ne) {
			System.out.println("Failed to use input, using 3.");
		}
		
		scanner.close();
	}
	
}