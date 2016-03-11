package net.picklez.as.exercises.challenge.puzzle;

/**
 * @author Ben Pickering
 * @since 11 Mar 2016 | 13:44:30
 */

public class Puzzle {

	public static void main(String[] args) {
		procedure("HURRICANE", 1, 4, 1, -1);
	}
	
	
	public static void procedure(String s, int col, int row, int colChange, int rowChange) {
		int curCol = col;
		int curRow = row;

		for (char c : s.toCharArray()) {
			System.out.println(curRow + ", " + curCol + ", " + c);
			curCol += colChange;
			curRow += rowChange;
		}
	}
	
}