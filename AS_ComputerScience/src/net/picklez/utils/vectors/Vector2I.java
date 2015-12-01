package net.picklez.utils.vectors;

/**
 * @author Ben Pickering
 * @since 12 Nov 2015 | 11:37:11
 * Class to hold two integer values
 */

public class Vector2I {

	private int x;
	private int y;
	
	/**
	 * Sets the variable data
	 * @param i - first integer value (x)
	 * @param j - second integer value (y)
	 */
	public Vector2I(int i, int j) {
		this.x = i;
		this.y = j;
	}
	
	/**
	 * Method to return first integer value
	 * @return - value of x (first integer value)
	 */
	public int getX() {
		return this.x;
	}
	
	/**
	 * Method to return second integer value
	 * @return - value of y (second integer value)
	 */
	public int getY() {
		return this.y;
	}
	
	/**
	 * Sets the first integer value to parameter
	 * @param i - new value for x (first integer value)
	 */
	public void setX(int i) {
		this.x = i;
	}
	
	/**
	 * Sets the second integer value to parameter
	 * @param i - new value for y (second integer value)
	 */
	public void setY(int i) {
		this.y = i;
	}
}