package net.picklez.as.exercises.booleanlogic;

/**
 * @author Ben Pickering
 * @since 26 Feb 2016 | 13:53:59
 */

public class BooleanLogic {

	public static void main(String[] args) {
		
		boolean a = true;
		boolean b = true;
		
		System.out.println("Truth table for and gate:");
		
		for (int i = 0; i <= 1; i++) {
			a = !a;
			for (int j = 0; j <= 1; j++) {
				b = !b;
				if (!b && a)
					System.out.println("");
				System.out.print((a && b) + ", ");
			}
		}
		
		System.out.println("\n\nTruth table for or gate:");
		
		for (int i = 0; i <= 1; i++) {
			a = !a;
			for (int j = 0; j <= 1; j++) {
				b = !b;
				if (!b && a)
					System.out.println("");
				System.out.print((a || b) + ", ");
			}
		}
		
		System.out.println("\n\nTruth table for xor gate:");
		
		for (int i = 0; i <= 1; i++) {
			a = !a;
			for (int j = 0; j <= 1; j++) {
				b = !b;
				if (!b && a)
					System.out.println("");
				System.out.print(((a || b) && (a != b)) + ", ");
			}
		}
		
		System.out.println("\n\nTruth table for nand gate:");
		
		for (int i = 0; i <= 1; i++) {
			a = !a;
			for (int j = 0; j <= 1; j++) {
				b = !b;
				if (!b && a)
					System.out.println("");
				System.out.print(!(a && b) + ", ");
			}
		}
	}


}