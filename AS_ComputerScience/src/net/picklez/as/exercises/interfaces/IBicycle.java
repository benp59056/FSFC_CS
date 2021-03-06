package net.picklez.as.exercises.interfaces;

/**
 * @author Ben Pickering
 * @since 3 Dec 2015 | 11:22:46
 */

public interface IBicycle {
	
	void changeCadence(int newValue);
	void changeGear(int newValue);
	void speedUp(int increment);
	void applyBreaks(int decrement);
	
}