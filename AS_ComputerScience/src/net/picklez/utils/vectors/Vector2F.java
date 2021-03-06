package net.picklez.utils.vectors;

/**
 * @author Ben Pickering
 * @since 17 Nov 2015 | 10:27:12
 * Class to hold 2 float values
 */

public class Vector2F {

	private float x;
	private float y;
	
	/**
	 * Sets the variable data
	 * @param i - first float value (x)
	 * @param j - second float value (y)
	 */
	public Vector2F(float i, float j) {
		this.x = i;
		this.y = j;
	}
	
	/**
	 * Method to return first float value
	 * @return - value of x (first float value)
	 */
	public float getX() {
		return this.x;
	}
	
	/**
	 * Method to return second float value
	 * @return - value of y (second float value)
	 */
	public float getY() {
		return this.y;
	}
	
	/**
	 * Sets the first float value to parameter
	 * @param i - new value for x (first float value)
	 */
	public void setX(float i) {
		this.x = i;
	}
	
	/**
	 * Sets the second float value to parameter
	 * @param i - new value for y (second float value)
	 */
	public void setY(float i) {
		this.y = i;
	}
}