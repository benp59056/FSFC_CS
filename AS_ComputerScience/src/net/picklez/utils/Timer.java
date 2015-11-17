package net.picklez.utils;

/**
 * @author Ben Pickering
 * @since 17 Nov 2015 | 10:05:40
 */

public class Timer {

	private long startTime;
	private long endTime;
	
	public Timer() {
		
	}
	
	public void setStartTime() {
		this.startTime = System.nanoTime();
	}
	
	public void setEndTime() {
		this.endTime = System.nanoTime();
	}
	
	public long getTimeElapsed() {
		return (this.endTime - this.startTime) / 1000000;
	}
}