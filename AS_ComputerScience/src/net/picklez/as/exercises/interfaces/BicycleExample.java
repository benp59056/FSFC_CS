package net.picklez.as.exercises.interfaces;

/**
 * @author Ben Pickering
 * @since 3 Dec 2015 | 11:23:53
 */

public class BicycleExample implements IBicycle {

	int cadence = 0;
	int speed = 0;
	int gear = 1;
	
	@Override
	public void changeCadence(int newValue) {
		cadence = newValue;
	}

	@Override
	public void changeGear(int newValue) {
		gear = newValue;
	}

	@Override
	public void speedUp(int increment) {
		speed += increment;
	}

	@Override
	public void applyBreaks(int decrement) {
		speed -= decrement;
	}

	public void printStates() {
		System.out.println("cadence: " + cadence + ", speed: " + speed + ", gear: " + gear);
	}
}