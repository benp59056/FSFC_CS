package net.picklez.as.exercises.challenge.sort;

import net.picklez.utils.ArrayUtils;

/**
 * @author Ben Pickering
 * @since 11 Mar 2016 | 13:58:48
 */

public class Main {


	public static void printArray(int[] a)
	{
		int n = 0, l = a.length - 1;		
		do { 
			System.out.print(a[n++] + ",");						
		} while (n < l);
		System.out.println(a[l]);		
	}

	public static void main(String[] args)
	{

		int[] sortMe = {88, 6,	54,	6,	36,	83,	56,	18,	1,	77,	48,	39,	76,	69,	81,	94,	98,	34,	32,	56,
				53,	77,	30,	24,	24,	84,	93,	38,	91,	76,	15,	76,	58,	23,	97,	47,	59,	56,	26,	93,
				38,	44,	0,	3,	30,	47,	22,	55,	76,	13,	79,	15,	65,	61,	5,	38,	90,	79,	24,	98,
				4,	75,	3,	73,	72,	16,	11,	82,	78,	16,	89,	16,	22,	69,	71,	76,	19,	5,	58,	41,
				7,	45,	47,	78,	26,	97,	52,	30,	14,	22,	42,	36,	44,	69,	5,	27,	83,	7,	79,	94};

		int[] sortMeBackup = sortMe.clone();

		System.out.println();
		printArray(sortMe);

		int comparisons = 0, assignments = 0, temp = 0;

		SortResult bubbleResult = bubbleSort(sortMe);
		
		sortMe = bubbleResult.getArray();
		assignments = bubbleResult.getAssignments();
		comparisons = bubbleResult.getComparisons();
		

		System.out.println();
		System.out.println("Bubble sort - No of comparisons: " + comparisons + ". No of assignments: " + assignments);
		System.out.println();		

		printArray(sortMe);	

		System.out.println();
		System.out.println("- - - - - - - - - - - - -");
		System.out.println();

		sortMe = sortMeBackup.clone();

		printArray(sortMe);					

		comparisons = 0; assignments = 0; temp = 0;

		SortResult insertionResult = insertionSort(sortMe);

		assignments = insertionResult.getAssignments();
		comparisons = insertionResult.getComparisons();

		System.out.println();
		System.out.println("Insertion sort - No of comparisons: " + comparisons + ". No of assignments: " + assignments);
		System.out.println();		

		printArray(sortMe);

	}
	
	/**
	 * This array sorting algorithm loops through (length-1^2) times
	 * @param array -- array to be sorted
	 * @return -- array sorted in ascending order
	 */
	public static SortResult bubbleSort(int[] array) {
		if (array.length < 2) 
			return null;

		int assign = 0;
		int compare = 0;
		
		for (int i = 0; i < array.length - 1; i++) {
			boolean changed = false;
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j+1]) {
					compare++;
					int temp = array[j];
					array[j] = array[j+1];
					assign++;
					array[j+1] = temp;
					assign++;
					changed = true;
				}
			}
			if (!changed)
				break;
		}

		return new SortResult(assign, compare, array);
	}

	/**
	 * "Loop forwards from position 2 to the end of the array.
	 * Loop backwards from the current position moving the
	 * number left till it reaches the right place"
	 * @param array -- array to be sorted
	 * @return -- array sorted in ascending order
	 */
	public static SortResult insertionSort(int[] array) {
		int curPos = 0;

		int assign = 0;
		int compare = 0;
		
		for (curPos = 1; curPos < array.length; curPos++) {
			while (curPos > 0 && array[curPos] < array[curPos-1]) {
				compare++;
				int temp = array[curPos];
				array[curPos] = array[curPos-1];
				array[curPos-1] = temp;
				assign+=2;
				curPos--;
			}
		}

		return new SortResult(assign, compare, array);
	}

	
	
}