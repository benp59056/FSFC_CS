package net.picklez.as.exercises.basic.calc;

import java.util.InputMismatchException;
import java.util.Scanner;

import net.picklez.utils.StringUtils;

/**
 * @author Ben Pickering
 */
public class CalculatorController {

	private Calculator calc;

	/**
	 * Constructor -- called once at runtime
	 */
	public CalculatorController(String[] args) {
		init();

		if (args.length < 3) {
			System.out.println("Didn't find three runtime arguments, please input your data into the console");
			fetchInput();
		} else {
			System.out.println("Using runtime arguments");
			useArgs(args);
		}
	}

	public static void main(String[] args) {
		new CalculatorController(args);
	}

	/**
	 * @description - the initial method to instantiate the Calculator object
	 */
	private void init() {
		this.calc = new Calculator();
	}

	/**
	 * @description - method opposed to fetchInput - using runtime arguments
	 * @param args - the runtime arguments parsed into the main method
	 */
	private void useArgs(String[] args) {
		try {
			float num1 = Float.parseFloat(args[0]);
			char action = args[1].charAt(0);
			float num2 = Float.parseFloat(args[2]);
			processCalc(num1, num2, action);
		} catch (InputMismatchException e) {
			System.out.println("Input mismatch. Closing.\n");
			e.printStackTrace();
		} catch (NumberFormatException nfe) {
			System.out.println("The number format was incorrect. Closing.\n");
			nfe.printStackTrace();
		}
	}

	/**
	 * @description - method used to obtain input via the console 
	 */
	private void fetchInput() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		try {
			float num1 = Float.parseFloat(scanner.nextLine());
			char action = scanner.nextLine().charAt(0);
			float num2 = Float.parseFloat(scanner.nextLine());
			processCalc(num1, num2, action);
		} catch (InputMismatchException e) {
			System.out.println("Input mismatch. Closing.\n");
			e.printStackTrace();
		} catch (NumberFormatException nfe) {
			System.out.println("The number format was incorrect. Closing.\n");
			nfe.printStackTrace();
		}
	}

	/**
	 * @description - used to process the calculation 
	 * @param numOne - the first number
	 * @param numTwo - the second number
	 * @param action - the action (must be '+', '-', '/' or '*')
	 */
	private void processCalc(float numOne, float numTwo, char action) {
		this.calc.setNumberOne(numOne);
		this.calc.setNumberTwo(numTwo);

		switch(action) {
		default: 
			System.out.println("The action specified was not valid.");
			break;
		case '+':
			this.printAnswer(calc.getNumberOne(), calc.getNumberTwo(), action, calc.add());
			break;
		case '-':
			this.printAnswer(calc.getNumberOne(), calc.getNumberTwo(), action, calc.subtract());
			break;
		case '*':
			this.printAnswer(calc.getNumberOne(), calc.getNumberTwo(), action, calc.multiply());
			break;
		case '/':
			this.printAnswer(calc.getNumberOne(), calc.getNumberTwo(), action, calc.divide());
			break;
		}
	}

	/**
	 * @description - used to print the answer in a formatted structure
	 * @param numOne - the first number
	 * @param numTwo - the second number
	 * @param action - the action (must be '+', '-', '/' or '*')
	 * @param result - the result of (numOne action numTwo)
	 */
	private void printAnswer(float numOne, float numTwo, char action, float result) {
		System.out.println(StringUtils.formatString("{0} {1} {2} = {3}", numOne, action, numTwo, result));
	}
}