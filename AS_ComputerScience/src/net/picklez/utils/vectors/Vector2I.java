package net.picklez.utils.vectors;

/**
 * @author Ben Pickering
 * @since 12 Nov 2015 | 11:37:11
 */

public class Vector2I {

	private int x;
	private int y;
	
	public Vector2I(int i, int j) {
		this.x = i;
		this.y = j;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setX(int i) {
		this.x = i;
	}
	
	public void setY(int i) {
		this.y = i;
	}
}