package net.picklez.utils.vectors;

/**
 * @author Ben Pickering
 * @since 17 Nov 2015 | 10:27:12
 */

public class Vector2F {

	private float x;
	private float y;
	
	public Vector2F(float i, float j) {
		this.x = i;
		this.y = j;
	}
	
	public float getX() {
		return this.x;
	}
	
	public float getY() {
		return this.y;
	}
	
	public void setX(float i) {
		this.x = i;
	}
	
	public void setY(float i) {
		this.y = i;
	}
}