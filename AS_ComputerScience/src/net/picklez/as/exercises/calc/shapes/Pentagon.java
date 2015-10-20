package net.picklez.as.exercises.calc.shapes;

public class Pentagon extends Shape {

	public Pentagon(int sideLength) {
		super(sideLength, sideLength, 5);
	}

	@Override
	public float getArea() {
		return (float) ((Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * (getWidth() * getWidth())));
	}
}