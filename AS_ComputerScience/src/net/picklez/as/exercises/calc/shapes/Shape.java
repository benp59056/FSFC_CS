package net.picklez.as.exercises.calc.shapes;

public abstract class Shape {

	private float width;
	private float height;
	private int numberSides;
	
	public Shape(int width, int height, int numSides) {
		this.width = width;
		this.height = height;
		this.numberSides = numSides;
	}
	
	public abstract float getArea();
	
	public float getWidth() {
		return this.width;
	}
	
	public float getHeight() {
		return this.height;
	}
	
	public int getNumberOfSides() {
		return this.numberSides;
	}
}