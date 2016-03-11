package net.picklez.as.exercises.challenge.sort;

/**
 * @author Ben Pickering
 * @since 11 Mar 2016 | 14:05:21
 * Description: class to hold results of a sort
 */

public class SortResult {
	
	private int assignments;
	private int comparisons;
	
	private int[] array;
	
	public SortResult(int assign, int comp, int[] array) {
		this.assignments = assign;
		this.comparisons = comp;
		this.array = array;
	}
	
	public int getAssignments() {
		return this.assignments;
	}
	
	public int getComparisons() {
		return this.comparisons;
	}
	
	public int[] getArray() {
		return this.array;
	}
	
}