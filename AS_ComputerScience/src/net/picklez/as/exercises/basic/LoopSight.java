package net.picklez.as.exercises.basic;

/**
 * @author Ben Pickering
 * @since 16 Oct 2015 | 13:51:54
 */

public class LoopSight {

	public static void main(String[] args) {
		
		
		
		/*int num = 3;
		if (num >= 0)
			if (num == 0)
				System.out.println("first string");
		else
				System.out.println("second string");
		
		System.out.println("third string");
		
		-- Reformatted for demonstration  of loops sight --
		
		if (num >= 0) {
			if (num == 0) {
				System.out.println("first string");
			} else {
				System.out.println("second string");
			}
		}
		System.out.println("third string"); */
		 
		int i = 42;
		String s = (i < 40) ? "life" : (i > 50) ? "universe" : "everything";
		System.out.println(s);
	}
}
