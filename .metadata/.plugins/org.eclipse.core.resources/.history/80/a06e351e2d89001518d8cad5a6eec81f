package net.picklez.as.exercises;

/**
 * @author Ben Pickering
 * @since 20 Oct 2015 | 09:38:02
 */

public class DelayLoop {

	public static void main(String[] args) {
		
		for (int i = 0; i < 2; i++) {
			System.out.println("First loop " + (i + 1) + " tick");
			for (int j = 0; j < 2; j++) {
				System.out.println("\tSecond loop " + (j+1) + " tick");
				for (int k = 0; k < 5; k++) {
					System.out.println("\t\tStalled by " + ((k+i) * 25) + " milliseconds");
					
					try {
						Thread.sleep(25);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
		
	}
	
}
