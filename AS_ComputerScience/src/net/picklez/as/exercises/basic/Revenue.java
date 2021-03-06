package net.picklez.as.exercises.basic;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author Ben Pickering
 * @since 16 Oct 2015 | 13:40:30
 */

public class Revenue {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter unit price");
		float price = scanner.nextFloat();
		
		System.out.println("Enter quantity bought");
		int units = scanner.nextInt();
		
		System.out.println("Enter percentage-off");
		float perc = scanner.nextFloat();
		
		float newPrice = price - (price * (perc/100));
		
		DecimalFormat df = new DecimalFormat(".00");
		System.out.println("Sale-price: �" + df.format(newPrice));
		
		System.out.println("Original revenue would've been: �" + df.format(price * units));
		System.out.println("Sale revenue: �" + df.format(newPrice * units));
	}
	
	
}