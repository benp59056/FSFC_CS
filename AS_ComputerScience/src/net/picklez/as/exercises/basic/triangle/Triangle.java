package net.picklez.as.exercises.basic.triangle;

import java.util.ArrayList;

public class Triangle {

	private ArrayList<Row> rows;
	
	public Triangle(int num) {
		this.rows = new ArrayList<Row>();
		this.generateTriangle(num);
	}
	
	private void generateTriangle(int numRows) {
		Row lastRow = null;
		for (int i = 1; i <= numRows; i++) {
			int lastNum = 0;
			if (i > 1) {
				lastNum = lastRow.getLastNum();
			}
			Row row = new Row(i, lastNum + 1);
			this.rows.add(row);
			lastRow = row;
		}
	}
	
	public void print() {
		for (Row row : this.rows) {
			row.print();
		}
	}
}