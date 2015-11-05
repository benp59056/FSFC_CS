package net.picklez.as.exercises;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your binary string:");
		try {
			String query = scanner.nextLine();
			if (query.matches("^[0-1]+$")) {
				System.out.println("\"" + query + "\" is binary");
				System.out.println("Would you like to convert it to denary? [y/n]");
				if (scanner.nextLine().toLowerCase().startsWith("y")) {
					System.out.println(query + " = " + convertFromBinary(query));
				}
			} else {
				System.out.println("\"" + query + "\" is not a binary value");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Closing.");
		scanner.close();
	}
	
	private static int convertFromBinary(String s) {
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
}