package net.picklez.as.exercises.basic.calc;

/**
 * @author Ben Pickering
 */
public class Calculator {

	private float numOne;
	private float numTwo;
	
	/**
	 * Constructor
	 */
	public Calculator() {
		
	}
	
	/**
	 * @return numOne
	 */
	public float getNumberOne() {
		return this.numOne;
	}
	
	/**
	 * @return numTwo
	 */
	public float getNumberTwo() {
		return this.numTwo;
	}
	
	/**
	 * @description - setter for numOne
	 * @param i - new value for numOne
	 */
	public void setNumberOne(float i) {
		this.numOne = i;
	}
	
	/**
	 * @description - setter for numTwo
	 * @param i - new value for numTwo
	 */
	public void setNumberTwo(float i) {
		this.numTwo = i;
	}
	
	/**
	 * @description - method for numOne + numTwo
	 * @return - numOne+numTwo
	 */
	public float add() {
		return numOne+numTwo;
	}
	
	/**
	 * @description - method for numOne / numTwo
	 * @return - numOne/numTwo
	 */
	public float divide() {
		return numOne/numTwo;
	}
	
	/**
	 * @description - method for numOne * numTwo
	 * @return - numOne*numTwo
	 */
	public float multiply() {
		return numOne*numTwo;
	}
	
	/**
	 * @description - method for numOne - numTwo
	 * @return - numOne-numTwo
	 */
	public float subtract() {
		return numOne - numTwo;
	}
}