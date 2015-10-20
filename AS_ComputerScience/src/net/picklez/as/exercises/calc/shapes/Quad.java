package net.picklez.as.exercises.calc.shapes;

public class Quad extends Shape {

	public Quad(int width, int height) {
		super(width, height, 4);
	}

	@Override
	public float getArea() {
		return getWidth() * getHeight();
	}

}
