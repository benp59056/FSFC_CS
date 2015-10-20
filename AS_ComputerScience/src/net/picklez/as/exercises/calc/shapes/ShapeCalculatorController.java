package net.picklez.as.exercises.calc.shapes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShapeCalculatorController {

	public ShapeCalculatorController(String[] args) {
		
		if (args.length < 2) {
			System.out.println("Did not use 2 or more arguments, please enter values now.");
			fetchInput();
		}
		
	}
	
	public static void main(String[] args) {
		new ShapeCalculatorController(args);
	}
	
	private void fetchInput() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String shape = "circle";
		float sideLength = 2;
		float sideHeight = 4;
		try {
			shape = scanner.nextLine();
			sideLength = Float.parseFloat(scanner.nextLine());
			sideHeight = Float.parseFloat(scanner.nextLine());
		} catch (InputMismatchException e) {
			System.out.println("Input mismatch. Using default values of 2, 4.\n");
			e.printStackTrace();
		} catch (NumberFormatException nfe) {
			System.out.println("The number format was incorrect. Using default values of 2, 4.\n");
			nfe.printStackTrace();
		}
		
		switch (shape) {
			default:
				System.out.println("\"" + shape + "\" is not a valid shape.");
				break;
			case "circle":
				//System.out.println(new Circle(sideLength).getArea() + "");
				break;
			case "square":
				break;
			case "rectangle":
				break;
			case "pentagon":
				break;
			case "hexagon":
				break;
			}
	}
}
