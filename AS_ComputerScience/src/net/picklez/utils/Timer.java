package net.picklez.utils;

/**
 * @author Ben Pickering
 * @since 17 Nov 2015 | 10:05:40
 * Class to manage time between two points
 */

public class Timer {

	private long startTime;
	private long endTime;
	
	public Timer() {
		
	}
	
	/**
	 * Sets the beginning time of the timer to current system time
	 */
	public void setStartTime() {
		this.startTime = System.nanoTime();
	}
	
	/**
	 * Sets the end time of the timer to current system time
	 */
	public void setEndTime() {
		this.endTime = System.nanoTime();
	}
	
	/**
	 * Returns the time taken between start and end in milliseconds
	 * @return - time taken in ms
	 */
	public long getTimeElapsed() {
		return (this.endTime - this.startTime) / 1000000;
	}
}