package net.picklez.as.exercises.arrays.twodimensions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Ben Pickering
 * @since 13 Nov 2015 | 13:26:52
 */

public class BowlingScores {

	public static void main(String[] args) {
		int[][] scores = new int[5][3];
		System.out.println(scores.length); //5
		System.out.println(scores[0].length); //3

		Scanner scanner = new Scanner(System.in);
		try {
			for (int i = 0; i < scores[0].length; i++) {
				System.out.println("Scores for player " + (i+1));
				for (int j = 0; j < scores.length; j++) {
					System.out.println("Input score #" + (j+1));
					scores[j][i] = scanner.nextInt();
				}
			}
			
			for (int i = 0; i < scores[0].length; i++) {
				System.out.print("Player " + (i+1) + ": ");
				for (int j = 0; j < scores.length; j++) {
					System.out.print(scores[j][i] + " ");
				}
				System.out.print("\n");
			}
		} catch (InputMismatchException | NumberFormatException e) {
			System.out.println("Input could not be used");
		}
		scanner.close();
	}

}