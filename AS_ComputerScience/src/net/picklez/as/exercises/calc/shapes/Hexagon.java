package net.picklez.as.exercises.calc.shapes;

public class Hexagon extends Shape {

	public Hexagon(int sideLength) {
		super(sideLength, sideLength, 6);
	}

	@Override
	public float getArea() {
		return (float)((3 * Math.sqrt(3)) / 2) * (getWidth() * getWidth());
	}

}
