package net.picklez.as.exercises.basic.triangle;

public class Row {

	private int[] nums;
	private int length;
	private int startNum;

	public Row(int length, int startNum) {
		this.length = length;
		this.startNum = startNum;
		
		this.nums = new int[length];
		
		this.createRow();
	}
	
	private void createRow() {
		for (int i = 0; i < length; i++) {
			this.nums[i] = startNum + i;
		}
	}
	
	public void print() {
		String result = "";
		for (int i : this.nums) {
			result += i + " ";
		}
		System.out.println(result);
	}
	
	public int getLastNum() {
		return this.nums[nums.length - 1];
	}
}