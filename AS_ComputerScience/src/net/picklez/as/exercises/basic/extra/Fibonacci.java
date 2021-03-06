package net.picklez.as.exercises.basic.extra;

/**
 * @author Ben Pickering
 * @since 16 Oct 2015 | 14:23:21
 */

public class Fibonacci {
	
	private int lastNum = 0;
	private int curNum = 1;
	
	public Fibonacci() {
		System.out.println("1");
		for (int i = 0; i < 15; i++) {
			int localCurNum = curNum;
			curNum += lastNum;
			System.out.println(curNum);
			lastNum = localCurNum;
		}
	}
	
	public static void main(String[] args) {
		new Fibonacci();
	}
	
}